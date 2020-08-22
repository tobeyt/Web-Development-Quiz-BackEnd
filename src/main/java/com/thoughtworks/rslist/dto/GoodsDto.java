package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "goods")
public class GoodsDto {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String goodsName;
    @NotNull
    private String goodsUrl;
    @NotNull
    private String price;
    @NotNull
    private String unit;

}
