package BigTask;

import java.util.ArrayList;
import java.util.List;

public class Mobil {
    int muatan;
    protected void muatanSedan(int berat){

        this.muatan=berat;
    }
    protected void muatanMinibus(int berat){
        this.muatan=berat;
    }
    protected void muatanBus(int berat){

        this.muatan=berat;
    }
    protected static void main(String[]args){
        List<String>hewan= new ArrayList<>();
        hewan.add("ayam,kucing,monyet") ;
        }
}
