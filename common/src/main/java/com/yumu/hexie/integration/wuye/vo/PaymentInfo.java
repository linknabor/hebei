package com.yumu.hexie.integration.wuye.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Transient;

import com.yumu.hexie.integration.wuye.util.KeyToNameUtil;

//单笔支付信息
public class PaymentInfo implements Serializable {

	private static final long serialVersionUID = 1176023527465139811L;
	private String tran_time;;
	private String bill_tran_amt;
	private String sect_name;
	private String paymethod;
	private String mianBill;
	private String mianAmt;
	private String show_invoice_flag;//是否开通电子发票功能
	private String show_com_flag;//是否允许公司开票功能
	private String invoice_title;//发票抬头（回显使用）
	private List<PaymentData> fee_data;
	@Transient
	public String getPaymethodStr(){
		return KeyToNameUtil.keyToName(KeyToNameUtil.PAYMETHOD_TYPE, paymethod);
	}
	public String getMianBill() {
		return mianBill;
	}
	public void setMianBill(String mianBill) {
		this.mianBill = mianBill;
	}
	public String getMianAmt() {
		return mianAmt;
	}
	public void setMianAmt(String mianAmt) {
		this.mianAmt = mianAmt;
	}
	public String getTran_time() {
		return tran_time;
	}
	public void setTran_time(String tran_time) {
		this.tran_time = tran_time;
	}
	public String getBill_tran_amt() {
		return bill_tran_amt;
	}
	public void setBill_tran_amt(String bill_tran_amt) {
		this.bill_tran_amt = bill_tran_amt;
	}
	public String getSect_name() {
		return sect_name;
	}
	public void setSect_name(String sect_name) {
		this.sect_name = sect_name;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public List<PaymentData> getFee_data() {
		return fee_data;
	}
	public void setFee_data(List<PaymentData> fee_data) {
		this.fee_data = fee_data;
	}
	public String getShow_invoice_flag() {
		return show_invoice_flag;
	}
	public void setShow_invoice_flag(String show_invoice_flag) {
		this.show_invoice_flag = show_invoice_flag;
	}
	public String getShow_com_flag() {
		return show_com_flag;
	}
	public void setShow_com_flag(String show_com_flag) {
		this.show_com_flag = show_com_flag;
	}
	public String getInvoice_title() {
		return invoice_title;
	}
	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}
	

}
