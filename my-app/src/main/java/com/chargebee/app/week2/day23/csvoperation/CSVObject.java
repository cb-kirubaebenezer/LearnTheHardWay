package com.chargebee.app.week2.day23.csvoperation;

public class CSVObject {
    private String customerId;
    private String subscriptionId;
    private String invoiceNumber;
    private String invoiceDate;
    private String startDate;
    private String amount;
    private String status;
    private String paidOn;
    private String nextRetry;
    private String refundedAmount;
    private String recurring;
    private String firstInvoice;
    private Customer customer;
    private String customerJsonString;
    private String taxTotal;
    public CSVObject(){

    }
    public String getCustomerId(){
        return customerId;
    }
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }

    public String getSubscriptionId(){
        return subscriptionId;
    }
    public void setSubsciptionId(String subsriptionId){
        this.subscriptionId = subsriptionId;
    }
    public String getInvoiceNumber(){
        return invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }
    public String getInvoiceDate(){
        return invoiceDate;
    }
    public void setInvoiceDate(String invoiceDate){
        this.invoiceDate = invoiceDate;
    }
    public String getStartDate(){
        return startDate;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    public String getAmount(){
        return amount;
    }
    public void setAmount(String amount){
        this.amount = amount;
    }
    public String getStatus(){
       return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getPaidOn(){
        return paidOn;
    }
    public void setPaidOn(String paidOn){
        this.paidOn = paidOn;
    }
    public String getNextRetry(){
        return nextRetry;
    }
    public void setNextEntry(String nextRetry){
        this.nextRetry = nextRetry;
    }
    public String getRefundedAmount(){
        return refundedAmount;
    }
    public void setRefundedAmount(String refundedAmount){
        this.refundedAmount = refundedAmount;
    }
    public String getRecurring(){
        return recurring;
    }
    public void setRecurring(String recurring){
        this.recurring = recurring;
    }
    public String getFirstInvoice(){
        return firstInvoice;
    }
    public void setFirstInvoice(String firstInvoice){
        this.firstInvoice = firstInvoice;
    }

    public  Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public String getCustomerJsonString(){
        return customerJsonString;
    }
    public void setCustomerJsonString(String json){
        this.customerJsonString = json;
    }
    public String getTaxTotal(){
        return taxTotal;
    }
    public void setTaxTotal(String taxTotal){
        this.taxTotal = taxTotal;
    }
}   