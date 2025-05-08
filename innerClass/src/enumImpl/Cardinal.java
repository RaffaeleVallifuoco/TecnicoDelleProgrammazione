package enumImpl;

public enum Cardinal {
    NORD, NORDNORDEST, ESTNORDEST, EASTNORDEAST,
    EAST, EASTSUDEAST, SUDEAST, SUDSUDEAST,
    SUD, SUDSUDOVEST, SUDOVEST, OVESTSUDOVEST,
    OVEST, OVESTNORDOVEST, NORDOVEST, NORDNORDOVEST;

    public boolean isOpposite(Cardinal point) {
        int indice = Cardinal.values().length;
        int indiceOpposto = (this.ordinal() + indice / 2) % indice;
        return point.ordinal() == indiceOpposto;
        // retturn point.ewquals(indiceOpposto);
    }

    public static Cardinal mix(Cardinal pointA, Cardinal pointB) {
        if (pointA == pointB)
            return pointA;
        if (pointA.isOpposite(pointB)) {
            System.out.println("I punti inseriti sono opposti : riprova");
            return null;
        } else {

            int indice = Cardinal.values().length;
            int indiceA = pointA.ordinal();
            int indiceB = pointB.ordinal();

            int differenza = Math.floorMod(indiceB - indiceA, indice);
            int halfDiff = differenza / 2;

            int indiceMedio = (indiceA + halfDiff) % indice;

            return Cardinal.values()[indiceMedio];
        }
    }
}
