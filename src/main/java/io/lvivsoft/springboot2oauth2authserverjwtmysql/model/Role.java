package io.lvivsoft.springboot2oauth2authserverjwtmysql.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Role extends BaseIdEntity{

    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "permission_role", joinColumns = {
            @JoinColumn(name = "role_id", referencedColumnName = "id") }, inverseJoinColumns = {
            @JoinColumn(name = "permission_id", referencedColumnName = "id") })
    private List<Permission> permissions;
}
