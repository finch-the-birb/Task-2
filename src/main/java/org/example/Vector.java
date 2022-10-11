package org.example;
import org.jetbrains.annotations.NotNull;
import java.util.Objects;
import java.lang.Math;

public class Vector {
    private double x, y, z;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX (double x) {
        this.x = x;
    }

    public void setY (double y) {
        this.y = y;
    }

    public void setZ (double z) {
        this.z = z;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public double getZ () {
        return z;
    }

    public double getVectorLen () {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2 + Math.pow(this.z, 2)));
    }

    public double getVectorScalar (@NotNull Vector vec) {
        return this.x * vec.x + this.y * vec.y + this.z * vec.z;
    }

    public Vector getVectorProd (@NotNull Vector vec) {
        double newCordX = this.y * vec.z + this.z * vec.y;
        double newCordY = this.z * vec.x + this.x * vec.z;
        double newCordZ = this.x * vec.y + this.y * vec.x;
        return new Vector(newCordX, newCordY, newCordZ);
    }

    public double getVectorAngle (@NotNull Vector vec) {
        return this.getVectorScalar(vec) / (this.getVectorLen() * vec.getVectorLen());
    }

    public Vector getVectorSimpleOperations(@NotNull Vector vec, char operation) {
        if (operation == '+') {
            return new Vector(this.x + vec.x, this.y + vec.y, this.z + vec.z);
        } else {
            return new Vector(this.x + vec.x, this.y + vec.y, this.z + vec.z);
        }
    }

    @Override
    public String toString() {
        return "{" + x + "; " + y + "; " + z + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Vector) return false;
        Vector vec = (Vector) o;
        return Double.compare(vec.x, x) == 0 && Double.compare(vec.y, y) == 0 && Double.compare(vec.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
