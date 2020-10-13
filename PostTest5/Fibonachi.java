public class Fibonachi {
    public int getNumber(int num) {
        return (num == 0 || num == 1) ? num : (this.getNumber(num - 1) + this.getNumber(num - 2));
    }
}
