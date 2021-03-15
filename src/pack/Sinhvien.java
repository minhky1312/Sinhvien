package pack;

import java.util.Date;

public class Sinhvien {

    public int idsv;
    public String tensv;
    public int idlop;
    public Date ngaysinh;

    public Sinhvien(int idsv, String tensv,int idlop,Date ngaysinh)
    {
        this.idsv = idsv;
        this.tensv=tensv;
        this.idlop= idlop;
        this.ngaysinh=ngaysinh;
    }

    public int getIdsv() { return this.idsv;}

    public String getTensv() {
        return this.tensv;
    }

    public int getsIdlop() {
        return this.idlop;
    }

    public Date getNgaysinh() {
        return this.ngaysinh;
    }

    @Override
    public String toString() {
        return this.tensv;
    }

}
