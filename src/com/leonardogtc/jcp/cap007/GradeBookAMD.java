package com.leonardogtc.jcp.cap007;

/**
 * GradeBook com utilização de array multidimensional
 */
public class GradeBookAMD {
    private String courseName; // nome do curso que este livro de notas representa
    private int[][] grades; // array bidimensional de notas de alunos

    // construtor de dois argumentos inicializa courseName e o array grades
    public GradeBookAMD(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // método para configurar o nome do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // método para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
    }

    // realiza várias operações nos dados
    public void processGrades() {
        // gera saída do array de notas
        outputGrades();

        // chama métodos getMinimum e getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade is", getMinimum(),
                "Highest grade is", getMaximum());

        // gera a saída do gráfico de distribuição de notas de todas as notas atribuídas
        outputBarChart();
    }

    public int getMinimum() {
        // Supor que o elemento zero seja o menor elemento
        int lowGrade = grades[0][0];

        // Percorrer as linhas do array de notas e comparar os valores determinando a menor nota final
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }

    public int getMaximum() {
        // Supor que o elemento zero seja o maior elemento
        int highGrade = grades[0][0];

        // Percorrer as linhas do array de notas e comparar os valores determinando a maior nota final
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }

        return highGrade;
    }

    // Retorna a média das notas
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        // Soma as notas dos alunos
        for (int grade : setOfGrades) {
            total += grade;
        }

        return (double) total / setOfGrades.length;
    }

    // Saída gráfica
    private void outputBarChart() {
        System.out.println("Distribuição de notas:");

        // Armazena a frequência de notas em casa intervalo de 10 notas
        int[] frequency = new int[11];

        // Para cada nota de GradeBook incrementar a frequência apropriada
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }

        // Para cada frequência de nota, imprime barra no gráfico
        for (int count = 0; count < frequency.length; count++) {
            // gera saída do rótulo de barra ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }


            // Imprime a barra de asterísticos
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // gera a saída do conteúdo do array de notas
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("                "); // alinha títulos de coluna

        // gera a saída da nota de cada aluno
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %2d ", test + 1);
        }

        System.out.println("Average");

        // cria linhas/colunas de texto que representam notas de array
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d      ", student + 1);

            for (int test : grades[student]) // gera saída de notas do aluno
                System.out.printf("%8d", test);

            // chama método getAverage para calcular a média do aluno;
            // passa linha de notas como o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
