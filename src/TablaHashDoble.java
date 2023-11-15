public class TablaHashDoble {
    private Entry[] T;
    public TablaHashDoble(int m){
        T=new Entry[m];
    }
    public boolean insertar(int k, String v){
        int j=0, i=0;
        while(i!=T.length){
            j=h(k,i);
            if(T[j]==null){
                T[j]=new Entry(k,v);
                return true;
            }else{
                i++;
            }
        }
        return false;
    }
    public String buscar(int k){
        int j=0, i=0;
        while(i!=T.length){
            j=h(k,i);
            if(T[j].k==k){
                return T[j].v;
            }else{
                i++;
            }
        }
        return null;
    }
    private int h1(int k){
        return k % T.length;
    }
    private int h2(int k){
        return 1+ (k % T.length-1);
    }
    private int h(int k, int i){
        return (h1(k) + i * h2(k))%T.length;
    }
    private class Entry{
        int k;
        String v;

        public Entry(int k, String v) {
            this.k = k;
            this.v = v;
        }
    }
}
