package com.engeto.ja.computers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate birthdate;
    private BigDecimal accountState;

    private int officeNo;

    public Employee(String name, LocalDate birthdate, BigDecimal accountState, int officeNo) {
        this.name = name;
        this.birthdate = birthdate;
        this.accountState = accountState;
        this.officeNo = officeNo;
    }
    public Employee(String name, LocalDate birthdate) {
        this(name, birthdate, BigDecimal.ZERO, 115);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public LocalDate getBirthdate() { return birthdate; }


    public void setBirthdate(LocalDate birthdate) { this.birthdate = birthdate; }
    public BigDecimal setAccountState() { return accountState; }
    public void setAccountState(BigDecimal accountState) {this.accountState = accountState;}

    public boolean canBuy(BigDecimal pricePerPiece, int pieces) {
        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(pieces));
        return accountState.compareTo(totalPrice) >= 0;
    }
}






