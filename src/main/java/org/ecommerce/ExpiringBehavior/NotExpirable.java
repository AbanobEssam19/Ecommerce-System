package org.ecommerce.ExpiringBehavior;

import java.util.Date;

public class NotExpirable implements ExpiringBehavior {

    public boolean isExpiring() {
        return false;
    }

    public Date getExpirationDate() {
        return null;
    }
}
