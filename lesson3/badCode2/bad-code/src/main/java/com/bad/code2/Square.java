package com.bad.code2;

/**
 * Класс, описывающий квадрат
 */
<<<<<<< HEAD
public class Square {
=======
public class Square implements Shape2D {
>>>>>>> cleanCode

    /**
     * координата центра фигуры по оси X
     */
    private Double x;

    /**
     * координата центра фигуры по оси Y
     */
    private Double y;

    /**
     * длина ребра квадрата
     */
    private Double edgeSize;

    /**
     * Коструктор класса
     *
     * @param centerX координатам центра фигуры по оси X
     * @param centerY координатам центра фигуры по оси Y
     * @param edgeSize длина стороны квадрата
     */
    public Square(Double centerX, Double centerY, Double edgeSize) {
        this.x = centerX;
        this.y = centerY;
        this.edgeSize = edgeSize;
    }

    /**
     * возвращает координату центра фигуры по оси X
     *
     * @return
     */
    public Double getX() {
        return x;
    }

    /**
     * возвращает координату центра фигуры по оси Y
     *
     * @return
     */
    public Double getY() {
        return y;
    }

    /**
     * возвращает периметр квадрата
     *
     * @return
     */
    public Double getArea() {
        return edgeSize * edgeSize;
    }
}
