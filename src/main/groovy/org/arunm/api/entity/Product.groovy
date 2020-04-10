package org.arunm.api.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "product",schema = "production")
@SuppressWarnings("unused")
class Product {

    @Column(name = "productid")
    @Id
    Integer productId

    String name

    @Column(name = "productnumber")
    String productNumber

    @Column(name = "makeflag")
    boolean makeFlag

    @Column(name = "finishedgoodsflag")
    boolean finishedGoodsFlag

    String color

    @Column(name = "safetystocklevel")
    Integer safetyStockLevel

    @Column(name = "reorderpoint")
    Integer reorderPoint

    @Column(name = "standardcost")
    Double standardCost

    @Column(name = "listprice")
    Double listPrice

    String size

    @Column(name = "sizeunitmeasurecode")
    String sizeUnitMeasureCode

    @Column(name = "weightunitmeasurecode")
    String weightUnitMeasureCode

    Double weight

    @Column(name = "daystomanufacture")
    Integer daysToManufacture

    @Column(name = "productline")
    String productLine

    @Column(name = "class")
    String classCode

    String style

    @Column(name = "productsubcategoryid")
    Integer productSubcategoryId

    @Column(name = "productmodelid")
    Integer productModelId

    @Column(name = "sellstartdate")
    LocalDate sellStartDate

    @Column(name = "sellenddate")
    LocalDate sellEndDate

    @Column(name = "discontinueddate")
    LocalDate discontinuedDate

    @Column(name = "modifieddate")
    LocalDate modifiedDate




}
