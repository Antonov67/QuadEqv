package com.company;

//решение квадратного уравнения
class QuadEqv{
    private double a,b,c;

    //конструктор
    public QuadEqv(double a, double b, double c) {
        if (a != 0){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            System.out.println("a не может быть равно нулю");
        }
    }
    //дискриминант
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    //корни
    public String getRoots(){
        if (getDiscriminant() < 0){
            return "Корней нет";
        }
        else if (getDiscriminant() == 0){
            return "Два одинаковых корня " + -b/(2*a);
        }
        else
            return "Два разных корня " + (-b + Math.sqrt(getDiscriminant()))/(2*a)
                    + " и " + (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }
}