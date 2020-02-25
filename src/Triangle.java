public class Triangle {
    public static String classifyTriangles (int a,int b,int c){
        if ((a+b)>c&& (b+c)>a&&(a+c)>b) {
            if (a == b && a == c && b == c) {
                return "la tam giac deu";
            }else if (a == b || a == c || b == c) {
                return "la tam giac can";
            }
        }
        return "khong la tam giac";
    }
}
