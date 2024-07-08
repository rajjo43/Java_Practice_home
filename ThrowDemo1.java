package self_study;

class ThrowDemo1 {
    static void play() throws Exception {
        System.out.println("before");
        throw new IllegalAccessException("demo");
        // System.out.println("after"); // This line is unreachable because of the exception
    }

    public static void main(String args[]) {
        try {
            play();
        } catch (Exception e) {
            System.out.println("caught me: " + e);
        }
    }
}

