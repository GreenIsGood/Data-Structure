/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class adjacencyMatrix {

    public final int MAX_VERTS = 6;
    public Vertex vertexList[] = new Vertex[MAX_VERTS];
    public int adjMat[][];
    public int nVerts;

    public adjacencyMatrix() {

        adjMat = new int[MAX_VERTS][MAX_VERTS];

        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }
    }

    public void addVertex(char lab) {

        vertexList[nVerts++] = new Vertex(lab);

    }

    public void addEdge(int start, int end) {
        if (start != end) {
            adjMat[start][end] = 1;
            adjMat[end][start] = 1;
        } else {
            JOptionPane.showMessageDialog(null, "loops are not allowed here");
        }
    }

    public String displayVer() {
        String out = "   ";
        for (int i = 0; i < nVerts; i++) {
            out += vertexList[i].display() + "  ";

        }

        return out;
    }

}
