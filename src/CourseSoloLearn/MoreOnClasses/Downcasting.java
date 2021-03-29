package CourseSoloLearn.MoreOnClasses;

    class Q {
        public void print() {
            System.out.println("Q");
        }
    }
    class W extends Q {
        public void print() {
            System.out.println("W");
        }
        public static void main(String[ ] args) {
            Q object = new W();
            W w = (W) object;
            w.print();
        }
}
