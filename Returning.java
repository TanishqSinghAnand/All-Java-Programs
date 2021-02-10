class Returning {
    int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    void main(int f, int s, int t, int fr) {
        int first = this.sum(f, s);
        int second = this.sum(t, fr);
        int mul = first * second;
        System.out.println("Multiply = " + mul);
    }
}
