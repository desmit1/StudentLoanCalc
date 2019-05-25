package app;
 
import java.time.LocalDate;

import javafx.beans.property.SimpleStringProperty;

public class PaymentDetails {

    SimpleStringProperty paymentId;
    SimpleStringProperty duedate;
    SimpleStringProperty payment;
    SimpleStringProperty additionalPayment;
    SimpleStringProperty interest;
    SimpleStringProperty principle;
    SimpleStringProperty balance;
///////jj
    public PaymentDetails(int paymentId, LocalDate dueDate, double payment, double additionalPayment, double interest, double principle, double balance) {
        this.paymentId = new SimpleStringProperty(String.valueOf(paymentId));
        this.duedate = new SimpleStringProperty(dueDate.toString());
        this.payment = new SimpleStringProperty(String.valueOf(payment));
        this.additionalPayment = new SimpleStringProperty(String.valueOf(additionalPayment));
        this.interest = new SimpleStringProperty(String.valueOf(interest));
        this.principle = new SimpleStringProperty(String.valueOf(principle));
        this.balance = new SimpleStringProperty(String.valueOf(balance));
    }

    public String getPaymentId() {
        return paymentId.get();
    }

    public SimpleStringProperty paymentIdProperty() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId.set(paymentId);
    }

    public String getDueDate() {
        return duedate.get();
    }

    public SimpleStringProperty dueDateProperty() {
        return duedate;
    }

    public void setduedate(String dueDate) {
        this.duedate.set(duedate);
    }

    public String getPayment() {
        return payment.get();
    }

    public SimpleStringProperty paymentProperty() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment.set(payment);
    }

    public String getAdditionalPayment() {
        return additionalPayment.get();
    }

    public SimpleStringProperty additionalPaymentProperty() {
        return additionalPayment;
    }

    public void setAdditionalPayment(String additionalPayment) {
        this.additionalPayment.set(additionalPayment);
    }

    public String getInterest() {
        return interest.get();
    }

    public SimpleStringProperty interestProperty() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest.set(interest);
    }

    public String getPrinciple() {
        return principle.get();
    }

    public SimpleStringProperty principleProperty() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle.set(principle);
    }

    public String getBalance() {
        return balance.get();
    }

    public SimpleStringProperty balanceProperty() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance.set(balance);
    }
}