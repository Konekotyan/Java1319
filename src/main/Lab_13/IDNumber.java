package main.Lab_13;

public class IDNumber {

    private Student[] uni;
    private int size;

    public IDNumber(int capacity) {
        this.uni = new Student[capacity];
        size = 0;
    }

    public void sort() {
        for (int left = 0; left < uni.length; left++) {
            Student value = uni[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getId() < uni[i].getId()) {
                    uni[i + 1] = uni[i];
                } else {
                    break;
                }
            }
            uni[i + 1] = value;
        }
    }

    public static Student[] mergeSort(Student[] a1, Student[] a2) {
        Student[] a3 = new Student[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {

            if (i > a1.length - 1) {
                Student a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i].getGpa() < a2[j].getGpa()) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else {
                Student b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }

    public void add(Student student) {
        uni[size] = student;
        size++;
    }


    public Student get(int index) {
        return uni[index];
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            out.append(uni[i].getName()).append("(id=").append(uni[i].getId()).append(")");
            if (i != size - 1) {
                out.append(", ");
            }
        }
        out.append("]");
        return out.toString();
    }
}