package org.ecommerce.ExpiringBehavior;

import java.util.Date;

public class Expirable implements ExpiringBehavior {

    private Date expirationDate;

    public Expirable(Date date) {
        this.expirationDate = date;
    }

    public boolean isExpiring() {
        return true;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }
}
