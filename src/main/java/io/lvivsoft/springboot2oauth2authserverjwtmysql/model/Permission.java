package io.lvivsoft.springboot2oauth2authserverjwtmysql.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Permission extends BaseIdEntity{

    private String name;
}
