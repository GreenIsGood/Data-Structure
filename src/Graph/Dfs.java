/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class Dfs {

    public final int MAX_VERTS = 15;
    public Vertex vertexList[];
    public int adjMat[][];
    public int nVerts;
    public Stack theStack;

    public Dfs() {
        vertexList = new Vertex[MAX_VERTS];

        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = -1;
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }
        theStack = new Stack();
    }

    public void addVertex(char lab) {
        vertexList[++nVerts] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        if (start != end) {
            adjMat[start][end] = 1;
            adjMat[end][start] = 1;
        } else {
            JOptionPane.showMessageDialog(null, "loops are not allowed here");
        }
    }

    String out = "";

    public String displayVertex(int v) {
        return out += vertexList[v].label + " ";
    }

    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        while (!theStack.isEmpty()) {

            int v = getAdjUnvisitedVertex((int) theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        for (int j = 0; j < nVerts + 1; j++) {
            vertexList[j].wasVisited = false;
        }
    }

    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts + 1; j++) {
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
                return j;
            }
        }
        return -1;
    }
}
