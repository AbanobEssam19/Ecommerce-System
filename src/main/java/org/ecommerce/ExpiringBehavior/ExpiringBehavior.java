package org.ecommerce.ExpiringBehavior;

import java.util.Date;

public interface ExpiringBehavior {
    public boolean isExpiring();
    public Date getExpirationDate();
}
