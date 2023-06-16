package Colecciones.Donacion;

import java.time.LocalDate;
import java.util.Objects;

public class Donation {
    private LocalDate date;
    private String document;
    private String ngo;
    private String projectCode;
    private double amount;


    public Donation(LocalDate date, String document, String ngo, String projectCode, double amount) {
        this.date = date;
        this.document = document;
        this.ngo = ngo;
        this.projectCode = projectCode;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDocument() {
        return document;
    }

    public String getNgo() {
        return ngo;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Objects.equals(date, donation.date) && Objects.equals(document, donation.document) && Objects.equals(projectCode, donation.projectCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, document, ngo, projectCode, amount);
    }
}

