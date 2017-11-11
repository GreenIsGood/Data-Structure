package allSort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mahmoud
 */
public class Data implements Comparable<Data> {

    public int num;
    public String name;

    public Data(int l) {
        num = l;
    }

    public Data(String s) {
        name = s;
    }

    public Data(String s, int l) {
        num = l;
        name = s;
    }

    public String display() {
        if (name == null) {
            return "[" + num + "]";
        }
        if (num == 0) {
            return "[" + name + "]";
        } else {
            return "[" + num + "  " + name + "]";
        }
        
    }
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Data) {
            return (name == null ? ((Data) o).name == null : name.equals(((Data) o).name)) && num == ((Data) o).num;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Data o) {
        if(o.name==null){
        if (getNum()> o.getNum()) {
            return 1;
        } else if (getNum() < o.getNum()) {
            return -1;
        } else {
            return 0;
        }
    }else {{
        if (getNum()> o.getNum()||getName().compareTo(o.name)>0) {
            return 1;
        } else if (getNum() < o.getNum()||getName().compareTo(o.name)<0) {
            return -1;
        } else {
            return 0;
        }
    }}
    }
}
