package gnu.kawa.util;

public class IdentityHashTable<K, V> extends GeneralHashTable<K, V> {
    public IdentityHashTable() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IdentityHashTable(int capacity) {
        super(capacity);
    }

    public int hash(Object key) {
        return System.identityHashCode(key);
    }

    public boolean matches(K value1, Object value2) {
        return value1 == value2;
    }
}
