package sukkiri_java_jissen_1;

public class Account {

    final String accountNo = "";
    public int zandaka;

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof final Account r)) {
            return false;
        }
        if (!accountNo.trim().equals(r.accountNo.trim())) {
            return false;
        }
        return true;
    }
}
