package com.tan.zhiyan2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description:
 * @date: 2020-06-15 15:12:14
 * @author: Tan.WL
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "umms_user")
public class ActiveUser {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    private String username;
    private String password;
}
