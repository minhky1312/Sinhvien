package pack;

public class Lop {
    public int idlop;
    public String tenlop;

    public Lop(int idlop, String tenlop)
    {
        this.idlop = idlop;
        this.tenlop = tenlop;
    }

    @Override
    public String toString() {
        return this.tenlop;
    }
}


