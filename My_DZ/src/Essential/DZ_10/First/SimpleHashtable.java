package Essential.DZ_10.First;

import java.util.*;

public class SimpleHashtable<K, V>  {
    private transient SimpleHashtable.Entry<?, ?>[] table;


    private static class Entry<K, V> implements java.util.Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        SimpleHashtable.Entry<K, V> next;

        protected Entry(int hash, K key, V value, SimpleHashtable.Entry<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        protected Object clone() {
            return new SimpleHashtable.Entry(this.hash, this.key, this.value, this.next == null ? null : (SimpleHashtable.Entry)this.next.clone());
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public V setValue(V value) {
            if (value == null) {
                throw new NullPointerException();
            } else {
                V oldValue = this.value;
                this.value = value;
                return oldValue;
            }
        }

        public boolean equals(Object o) {
            if (!(o instanceof java.util.Map.Entry)) {
                return false;
            } else {
                boolean var10000;
                label38: {
                    label27: {
                        java.util.Map.Entry<?, ?> e = (java.util.Map.Entry)o;
                        if (this.key == null) {
                            if (e.getKey() != null) {
                                break label27;
                            }
                        } else if (!this.key.equals(e.getKey())) {
                            break label27;
                        }

                        if (this.value == null) {
                            if (e.getValue() == null) {
                                break label38;
                            }
                        } else if (this.value.equals(e.getValue())) {
                            break label38;
                        }
                    }

                    var10000 = false;
                    return var10000;
                }

                var10000 = true;
                return var10000;
            }
        }

        public int hashCode() {
            return this.hash ^ Objects.hashCode(this.value);
        }

        public String toString() {
            return this.key.toString() + "=" + this.value.toString();
        }
    }
}


