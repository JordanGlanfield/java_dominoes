import java.util.Objects;

class Domino {

    Domino(int left, int right) {
    }

    int getLeft() {
        throw new UnsupportedOperationException("Not implmented yet");
    }

    int getRight() {
        throw new UnsupportedOperationException("Not implmented yet");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Domino domino = (Domino) o;
        return (getLeft() == domino.getLeft() && getRight() == domino.getRight()) ||
            (getLeft() == domino.getRight() && getRight() == domino.getLeft());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeft() + getRight());
    }
}
