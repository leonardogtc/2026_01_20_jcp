package com.leonardogtc.jcp.cap007;

public class GradeBook {
    private String courseName;  // Nome do curso
    private int[] grades;   // Array de notas

    // Construtor
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // Método para confugurar o nome do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Método para obter o nome do curso
    public String getCourseName() {
        return courseName;
    }

    public void processGrades() {
        outputGrades(); // Gera a saída do array de notas

        // Chama o método getAverage() para calcular a média
        System.out.printf("%nClass average is %.2f%n", getAverage());

        // chama métodos getMinimum e getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
                getMinimum(), getMaximum());

        // chama outputBarChart para imprimir gráfico de distribuição de nota
        outputBarChart();

    }

    // Localiza a nota mínima
    public int getMinimum() {
        int lowGrade = grades[0]; // supõe que a grade[0] seja a menor nota
        for (int grade : grades) {
            if (grade < lowGrade) {
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    // Localiza a nota máxima
    public int getMaximum() {
        int highGrade = grades[0]; // supõe que a grade[0] seja a maior nota
        for (int grade : grades) {
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        return highGrade;
    }

    // Determina a média para o teste
    public double getAverage() {
        int total = 0;

        // Soma as notas dos alunos
        for (int grade : grades) {
            total += grade;
        }

        return (double) total / grades.length;
    }

    // gera a saída do gráfico de barras exibindo distribuição de notas
    public void outputBarChart() {
        System.out.println("Distribuição de notas:");

        // Armazena a frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        // para cada nota, incrementa a frequência apropriada
        for (int grade : grades) {
            ++frequency[grade / 10];
        }

        // para cada frequência de nota, imprime barra no gráfico
        for (int count = 0; count < frequency.length; count++) {
            // gera a saída do rótulo da barra
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            // gera a saída da barra
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }

    // gera a saída do conteúdo do array de notas
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");

        // gera a saída da nota de cada aluno
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }


}
