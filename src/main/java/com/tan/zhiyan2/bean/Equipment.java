package com.tan.zhiyan2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Table;

/**
 * @Description:
 * @date: 2020-06-16 09:47:27
 * @author: Tan.WL
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "umms_user")
public class Equipment {
}
