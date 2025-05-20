public class Relation<A, B> {
    private A pointA;
    private B pointB;
    private String strRelation;

    public Relation(A pointA, B pointB, String strRelation) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.strRelation = strRelation;
    }

    public void showRelation() {
        System.out.print(pointA);
        System.out.print(strRelation);
        System.out.print(pointB);
    }

    public static void main(String[] args) {
        Relation<String, Integer> r1 = new Relation<>("Ocho", 8, "Esta cantidad se representa por");
        r1.showRelation();
    }
}
