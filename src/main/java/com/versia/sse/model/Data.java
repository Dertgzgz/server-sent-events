package com.versia.sse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "centerId",
        "cashRegisterId",
        "ticketNumber"
})
public class Data {

    /**
     * Centro donde se realiza la venta
     * (Required)
     *
     */
    @JsonProperty("centerId")
    @JsonPropertyDescription("Centro donde se realiza la venta")
    private Integer centerId;
    /**
     * Id de la caja que realiza la venta
     * (Required)
     *
     */
    @JsonProperty("cashRegisterId")
    @JsonPropertyDescription("Id de la caja que realiza la venta")
    private Integer cashRegisterId;
    /**
     * Id único del ticket
     * (Required)
     *
     */
    @JsonProperty("ticketNumber")
    @JsonPropertyDescription("Id \u00fanico del ticket")
    private Integer ticketNumber;

    /**
     * Centro donde se realiza la venta
     * (Required)
     *
     */
    @JsonProperty("centerId")
    public Integer getCenterId() {
        return centerId;
    }

    /**
     * Centro donde se realiza la venta
     * (Required)
     *
     */
    @JsonProperty("centerId")
    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    /**
     * Id de la caja que realiza la venta
     * (Required)
     *
     */
    @JsonProperty("cashRegisterId")
    public Integer getCashRegisterId() {
        return cashRegisterId;
    }

    /**
     * Id de la caja que realiza la venta
     * (Required)
     *
     */
    @JsonProperty("cashRegisterId")
    public void setCashRegisterId(Integer cashRegisterId) {
        this.cashRegisterId = cashRegisterId;
    }

    /**
     * Id único del ticket
     * (Required)
     *
     */
    @JsonProperty("ticketNumber")
    public Integer getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Id único del ticket
     * (Required)
     *
     */
    @JsonProperty("ticketNumber")
    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

}
