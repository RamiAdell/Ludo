/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import java.awt.Robot;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Rami
 */
public class NewJFrame extends javax.swing.JFrame {

    Robot sa;
    int[][] blueone = {
        {335, 35},
        {335, 85},
        {335, 135},
        {335, 185},
        {335, 235},
        {385, 235},
        {435, 235},
        {485, 235},
        {535, 235},
        {535, 285},
        {535, 335},
        {485, 335},
        {435, 335},
        {385, 335},
        {335, 335},
        {335, 385},
        {335, 435},
        {335, 485},
        {335, 535},
        {285, 535},
        {235, 535},
        {235, 485},
        {235, 435},
        {235, 385},
        {235, 335},
        {185, 335},
        {135, 335},
        {85, 335},
        {35, 335},
        {35, 285},
        {35, 235},
        {85, 235},
        {135, 235},
        {185, 235},
        {235, 235},
        {235, 185},
        {235, 135},
        {235, 85},
        {235, 35},
        {285, 35},
        {285, 85},
        {285, 135},
        {285, 185},
        {285, 235},
        {285, 285}};
    int redone[][] = {{235, 536},
    {235, 485},
    {235, 435},
    {235, 385},
    {235, 335},
    {185, 335},
    {135, 335},
    {85, 335},
    {35, 335},
    {35, 285},
    {35, 235},
    {85, 235},
    {135, 235},
    {185, 235},
    {235, 235},
    {235, 185},
    {235, 135},
    {235, 85},
    {235, 35},
    {285, 35},
    {335, 35},
    {335, 85},
    {335, 135},
    {335, 185},
    {335, 235},
    {385, 235},
    {435, 235},
    {485, 235},
    {535, 235},
    {535, 285},
    {535, 335},
    {485, 335},
    {435, 335},
    {385, 335},
    {335, 335},
    {335, 385},
    {335, 435},
    {335, 485},
    {335, 535},
    {285, 535},
    {285, 485},
    {285, 435},
    {285, 385},
    {285, 335},
    {285, 285}};

    int randomNum;
    int co = 1;

    int x1C;
    int y1C;

    int x2C;
    int y2C;

    int x3C;
    int y3C;

    int x4C;
    int y4C;

    int x1;
    int y1;

    int x2;
    int y2;

    int x3;
    int y3;

    int x4;
    int y4;

    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;

    int z1 = 0;
    int z2 = 0;
    int z3 = 0;
    int z4 = 0;

    void red1butt(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x1 = redone[z1][0];
                y1 = redone[z1][1];
                red1butt.setLocation(x1, y1);
                z1++;
            }
        }
        if (n == 6 && x1 == 0 && y1 == 0) {
            x1 = redone[0][0];
            y1 = redone[0][1];
            red1butt.setLocation(x1, y1);
            z1++;
        } else {
            for (int v = 0; v < n; v++) {
                x1 = redone[z1][0];
                y1 = redone[z1][1];
                red1butt.setLocation(x1, y1);
                z1++;
            }
        }
    }
    void red1(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x1 = redone[z1][0];
                y1 = redone[z1][1];
                red1.setLocation(x1, y1);
                z1++;
            }
        }
        if (n == 6 && x1 == 0 && y1 == 0) {
            x1 = redone[0][0];
            y1 = redone[0][1];
            red1.setLocation(x1, y1);
            z1++;
        } else {
            for (int v = 0; v < n; v++) {
                x1 = redone[z1][0];
                y1 = redone[z1][1];
                red1.setLocation(x1, y1);
                z1++;
            }
        }
    }

    void red1kill() {
        if ((x1C == x1 && y1C == y1)) {
            blue1butt.setLocation(487, 35);
            i1 = 0;
        } else if ((x2C == x1 && y2C == y1)) {
            blue2butt.setLocation(537, 35);
            i2 = 0;
        } else if ((x3C == x1 && y3C == y1)) {
            blue3butt.setLocation(487, 85);
            i3 = 0;
        } else if ((x4C == x1 && y4C == y1)) {
            blue4butt.setLocation(537, 85);
            i4 = 0;
        }
    }

    void red2butt(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x2 = redone[z2][0];
                y2 = redone[z2][1];
                red2butt.setLocation(x2, y2);
                z2++;
            }
        }
        if (n == 6 && x2 == 0 && y2 == 0) {
            x2 = redone[0][0];
            y2 = redone[0][1];
            red2butt.setLocation(x2, y2);
            z2++;
        } else {
            for (int v = 0; v < n; v++) {
                x2 = redone[z2][0];
                y2 = redone[z2][1];
                red2butt.setLocation(x2, y2);
                z2++;
            }
        }
    }
    void red2(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x2 = redone[z2][0];
                y2 = redone[z2][1];
                red2.setLocation(x2, y2);
                z2++;
            }
        }
        if (n == 6 && x2 == 0 && y2 == 0) {
            x2 = redone[0][0];
            y2 = redone[0][1];
            red2.setLocation(x2, y2);
            z2++;
        } else {
            for (int v = 0; v < n; v++) {
                x2 = redone[z2][0];
                y2 = redone[z2][1];
                red2.setLocation(x2, y2);
                z2++;
            }
        }
    }

    void red2kill() {
        if ((x1C == x2 && y1C == y2)) {
            blue1butt.setLocation(487, 35);
            i1 = 0;
        } else if ((x2C == x2 && y2C == y2)) {
            blue2butt.setLocation(537, 35);
            i2 = 0;
        } else if ((x3C == x2 && y3C == y2)) {
            blue3butt.setLocation(487, 85);
            i3 = 0;
        } else if ((x4C == x2 && y4C == y2)) {
            blue4butt.setLocation(537, 85);
            i4 = 0;
        }
    }

    void red3butt(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x3 = redone[z3][0];
                y3 = redone[z3][1];
                red3butt.setLocation(x3, y3);
                z3++;
            }
        }
        if (n == 6 && x3 == 0 && y3 == 0) {
            x3 = redone[0][0];
            y3 = redone[0][1];
            red3butt.setLocation(x3, y3);
            z3++;
        } else {
            for (int v = 0; v < n; v++) {
                x3 = redone[z3][0];
                y3 = redone[z3][1];
                red3butt.setLocation(x3, y3);
                z3++;
            }
        }
    }
    void red3(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x3 = redone[z3][0];
                y3 = redone[z3][1];
                red3.setLocation(x3, y3);
                z3++;
            }
        }
        if (n == 6 && x3 == 0 && y3 == 0) {
            x3 = redone[0][0];
            y3 = redone[0][1];
            red3.setLocation(x3, y3);
            z3++;
        } else {
            for (int v = 0; v < n; v++) {
                x3 = redone[z3][0];
                y3 = redone[z3][1];
                red3.setLocation(x3, y3);
                z3++;
            }
        }
    }

    void red3kill() {
        if ((x1C == x3 && y1C == y3)) {
            blue1butt.setLocation(487, 35);
            i1 = 0;
        } else if ((x2C == x1 && y2C == y3)) {
            blue2butt.setLocation(537, 35);
            i2 = 0;
        } else if ((x3C == x3 && y3C == y1)) {
            blue3butt.setLocation(487, 85);
            i3 = 0;
        } else if ((x4C == x3 && y4C == y3)) {
            blue4butt.setLocation(537, 85);
            i4 = 0;
        }
    }

    void red4butt(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x4 = redone[z4][0];
                y4 = redone[z4][1];
                red4butt.setLocation(x4, y4);
                z4++;
            }
        }
        if (n == 6 && x4 == 0 && y4 == 0) {
            x4 = redone[0][0];
            y4 = redone[0][1];
            red4butt.setLocation(x4, y4);
            z4++;
        } else {
            for (int v = 0; v < n; v++) {
                x4 = redone[z4][0];
                y4 = redone[z4][1];
                red4butt.setLocation(x4, y4);
                z4++;
            }
        }
    }
    void red4(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x4 = redone[z4][0];
                y4 = redone[z4][1];
                red4.setLocation(x4, y4);
                z4++;
            }
        }
        if (n == 6 && x4 == 0 && y4 == 0) {
            x4 = redone[0][0];
            y4 = redone[0][1];
            red4.setLocation(x4, y4);
            z4++;
        } else {
            for (int v = 0; v < n; v++) {
                x4 = redone[z4][0];
                y4 = redone[z4][1];
                red4.setLocation(x4, y4);
                z4++;
            }
        }
    }

    void red4kill() {
        if ((x1C == x4 && y1C == y4)) {
            blue1butt.setLocation(487, 35);
            i1 = 0;
        } else if ((x2C == x4 && y2C == y4)) {
            blue2butt.setLocation(537, 35);
            i2 = 0;
        } else if ((x3C == x4 && y3C == y4)) {
            blue3butt.setLocation(487, 85);
            i3 = 0;
        } else if ((x4C == x4 && y4C == y4)) {
            blue4butt.setLocation(537, 85);
            i4 = 0;
        }
    }

    void blue1butt(int n) {

        if (n > 6) {
            for (int v = 0; v < n; v++) {

                x1C = blueone[i1][0];
                y1C = blueone[i1][1];
                blue1butt.setLocation(x1C, y1C);
                i1++;
            }
        }
        if (n == 6 && x1C == 0 && y1C == 0) {
            x1C = blueone[0][0];
            y1C = blueone[0][1];
            blue1butt.setLocation(x1C, y1C);
            i1++;
        } else {
            for (int v = 0; v < n; v++) {
                x1C = blueone[i1][0];
                y1C = blueone[i1][1];
                blue1butt.setLocation(x1C, y1C);
                i1++;
            }
        }
    }
    void blue1(int n) {

        if (n > 6) {
            for (int v = 0; v < n; v++) {
                
                
                x1C = blueone[i1][0];
                y1C = blueone[i1][1];
                blue1.setLocation(x1C, y1C);
                i1++;
            }
        }
        if (n == 6 && x1C == 0 && y1C == 0) {
            x1C = blueone[0][0];
            y1C = blueone[0][1];
            blue1.setLocation(x1C, y1C);
            i1++;
        } else {
            for (int v = 0; v < n; v++) {
                x1C = blueone[i1][0];
                y1C = blueone[i1][1];
                blue1.setLocation(x1C, y1C);
                i1++;
            }
        }
    }

    void blue1kill() {
        if ((x1C == x1 && y1C == y1)) {
            red1butt.setLocation(35, 490);
            z1 = 0;
        } else if ((x1C == x2 && y1C == y2)) {
            red2butt.setLocation(85, 490);
            z2 = 0;
        } else if ((x1C == x3 && y1C == y3)) {
            red3butt.setLocation(35, 540);
            z3 = 0;
        } else if ((x1C == x4 && y1C == y4)) {
            red4butt.setLocation(85, 540);
            z4 = 0;
        }
    }

    void blue2butt(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x2C = blueone[i2][0];
                y2C = blueone[i2][1];
                blue2butt.setLocation(x2C, y2C);
                i2++;
            }
        }
        if (n == 6 && x2C == 0 && y2C == 0) {
            x2C = blueone[0][0];
            y2C = blueone[0][1];
            blue2butt.setLocation(x2C, y2C);
            i2++;
        } else {
            for (int v = 0; v < n; v++) {
                x2C = blueone[i2][0];
                y2C = blueone[i2][1];
                blue2butt.setLocation(x2C, y2C);
                i2++;
            }
        }
    }
    void blue2(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x2C = blueone[i2][0];
                y2C = blueone[i2][1];
                blue2.setLocation(x2C, y2C);
                i2++;
            }
        }
        if (n == 6 && x2C == 0 && y2C == 0) {
            x2C = blueone[0][0];
            y2C = blueone[0][1];
            blue2.setLocation(x2C, y2C);
            i2++;
        } else {
            for (int v = 0; v < n; v++) {
                x2C = blueone[i2][0];
                y2C = blueone[i2][1];
                blue2.setLocation(x2C, y2C);
                i2++;
            }
        }
    }

    void blue2kill() {
        if ((x2C == x1 && y2C == y1)) {
            red1butt.setLocation(35, 490);
            z1 = 0;
        } else if ((x2C == x2 && y2C == y2)) {
            red2butt.setLocation(85, 490);
            z2 = 0;
        } else if ((x2C == x3 && y2C == y3)) {
            red3butt.setLocation(35, 540);
            z3 = 0;
        } else if ((x2C == x4 && y2C == y4)) {
            red4butt.setLocation(85, 540);
            z4 = 0;
        }
    }

    void blue3butt(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x3C = blueone[i3][0];
                y3C = blueone[i3][1];
                blue3butt.setLocation(x3C, y3C);
                i3++;
            }
        }
        if (n == 6 && x3C == 0 && y3C == 0) {
            x3C = blueone[0][0];
            y3C = blueone[0][1];
            blue3butt.setLocation(x3C, y3C);
            i3++;
        } else {
            for (int v = 0; v < n; v++) {
                x3C = blueone[i3][0];
                y3C = blueone[i3][1];
                blue3butt.setLocation(x3C, y3C);
                i3++;
            }
        }
    }
    void blue3(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x3C = blueone[i3][0];
                y3C = blueone[i3][1];
                blue3.setLocation(x3C, y3C);
                i3++;
            }
        }
        if (n == 6 && x3C == 0 && y3C == 0) {
            x3C = blueone[0][0];
            y3C = blueone[0][1];
            blue3.setLocation(x3C, y3C);
            i3++;
        } else {
            for (int v = 0; v < n; v++) {
                x3C = blueone[i3][0];
                y3C = blueone[i3][1];
                blue3.setLocation(x3C, y3C);
                i3++;
            }
        }
    }

    void blue3kill() {
        if ((x3C == x1 && y3C == y1)) {
            red1butt.setLocation(35, 490);
            z1 = 0;
        } else if ((x3C == x2 && y3C == y2)) {
            red2butt.setLocation(85, 490);
            z2 = 0;
        } else if ((x3C == x3 && y3C == y3)) {
            red3butt.setLocation(35, 540);
            z3 = 0;
        } else if ((x3C == x4 && y3C == y4)) {
            red4butt.setLocation(85, 540);
            z4 = 0;
        }
    }

    void blue4butt(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x4C = blueone[i4][0];
                y4C = blueone[i4][1];
                blue4butt.setLocation(x4C, y4C);
                i4++;
            }
        }
        if (n == 6 && x4C == 0 && y4C == 0) {
            x4C = blueone[0][0];
            y4C = blueone[0][1];
            blue4butt.setLocation(x4C, y4C);
            i4++;
        } else {
            for (int v = 0; v < n; v++) {
                x4C = blueone[i4][0];
                y4C = blueone[i4][1];
                blue4butt.setLocation(x4C, y4C);
                i4++;
            }
        }
    }
    void blue4(int n) {
        if (n > 6) {
            for (int v = 0; v < n; v++) {
                x4C = blueone[i4][0];
                y4C = blueone[i4][1];
                blue4.setLocation(x4C, y4C);
                i4++;
            }
        }
        if (n == 6 && x4C == 0 && y4C == 0) {
            x4C = blueone[0][0];
            y4C = blueone[0][1];
            blue4.setLocation(x4C, y4C);
            i4++;
        } else {
            for (int v = 0; v < n; v++) {
                x4C = blueone[i4][0];
                y4C = blueone[i4][1];
                blue4.setLocation(x4C, y4C);
                i4++;
            }
        }
    }

    void blue4kill() {
        if ((x4C == x1 && y4C == y1)) {
            red1.setLocation(35, 490);
            red1butt.setVisible(false);
            z1 = 0;
        } else if ((x4C == x2 && y4C == y2)) {
            red2.setLocation(85, 490);
            red2butt.setVisible(false);
            z2 = 0;
        } else if ((x4C == x3 && y4C == y3)) {
            red3.setLocation(35, 540);
            red3butt.setVisible(false);
            z3 = 0;
        } else if ((x4C == x4 && y4C == y4)) {
            red4.setLocation(85, 540);
            red4butt.setVisible(false);
            z4 = 0;
            
        }
    }

    void LastCardB1() {

        if (x1C == 285 && y1C == 35 && randomNum > 5) {
            blue1butt.setEnabled(false);
        } else if (x1C == 285 && y1C == 85 && randomNum > 4) {
            blue1butt.setEnabled(false);
        } else if (x1C == 285 && y1C == 135 && randomNum > 3) {
            blue1butt.setEnabled(false);
        } else if (x1C == 285 && y1C == 185 && randomNum > 2) {
            blue1butt.setEnabled(false);
        } else if (x1C == 285 && y1C == 235 && randomNum > 1) {
            blue1butt.setEnabled(false);
        } else if (x1C == 285 && y1C == 285) {
            blue1butt.setEnabled(false);
        } else if (x1C == 0 && y1C == 0) {
            blue1butt.setEnabled(false);
            if (randomNum == 6) { // can be disabled
                blue1butt.setEnabled(true);
            }
        }

    }

    void LastCardB2() {
        if (x2C == 285 && y2C == 35 && randomNum > 5) {
            blue2butt.setEnabled(false);
        } else if (x2C == 285 && y2C == 85 && randomNum > 4) {
            blue2butt.setEnabled(false);
        } else if (x2C == 285 && y2C == 135 && randomNum > 3) {
            blue2butt.setEnabled(false);
        } else if (x2C == 285 && y2C == 185 && randomNum > 2) {
            blue2butt.setEnabled(false);
        } else if (x2C == 285 && y2C == 235 && randomNum > 1) {
            blue2butt.setEnabled(false);
        } else if (x2C == 285 && y2C == 285) {
            blue2butt.setEnabled(false);
        } else if (x2C == 0 && y2C == 0) {
            blue2butt.setEnabled(false);
            if (randomNum == 6) {
                blue2butt.setEnabled(true);
            }
        }

    }

    void LastCardB3() {

        if (x3C == 285 && y3C == 35 && randomNum > 5) {
            blue3butt.setEnabled(false);
        } else if (x3C == 285 && y3C == 85 && randomNum > 4) {
            blue3butt.setEnabled(false);
        } else if (x3C == 285 && y3C == 135 && randomNum > 3) {
            blue3butt.setEnabled(false);
        } else if (x3C == 285 && y3C == 185 && randomNum > 2) {
            blue3butt.setEnabled(false);
        } else if (x3C == 285 && y3C == 235 && randomNum > 1) {
            blue3butt.setEnabled(false);
        } else if (x3C == 285 && y3C == 285) {
            blue3butt.setEnabled(false);
        } else if (x3C == 0 && y3C == 0) {
            blue3butt.setEnabled(false);
            if (randomNum == 6) {
                blue3butt.setEnabled(true);
            }
        }

    }

    void LastCardB4() {

        if (x4C == 285 && y4C == 35 && randomNum > 5) {
            blue4butt.setEnabled(false);
        } else if (x4C == 285 && y4C == 85 && randomNum > 4) {
            blue4butt.setEnabled(false);
        } else if (x4C == 285 && y4C == 135 && randomNum > 3) {
            blue4butt.setEnabled(false);
        } else if (x4C == 285 && y4C == 185 && randomNum > 2) {
            blue4butt.setEnabled(false);
        } else if (x4C == 285 && y4C == 235 && randomNum > 1) {
            blue4butt.setEnabled(false);
        } else if (x4C == 285 && y4C == 285) {
            blue4butt.setEnabled(false);
        } else if (x4C == 0 && y4C == 0) {
            blue4butt.setEnabled(false);
            if (randomNum == 6) {
                blue4butt.setEnabled(true);
            }
        }

    }

    void BlueUserTurn() {
        red1butt.setEnabled(false);
        red2butt.setEnabled(false);
        red3butt.setEnabled(false);
        red4butt.setEnabled(false);
        if (randomNum == 6) {
            blue1butt.setEnabled(true);
            LastCardB1();
            blue2butt.setEnabled(true);
            LastCardB2();
            blue3butt.setEnabled(true);
            LastCardB3();
            blue4butt.setEnabled(true);
            LastCardB4();

        }

        if (randomNum != 6) {
            if (x1C == 0 && y1C == 0) {
                blue1butt.setEnabled(false);
            } else {
                blue1butt.setEnabled(true);
                LastCardB1();
            }
            if (x2C == 0 && y1C == 0) {
                blue2butt.setEnabled(false);
            } else {
                blue2butt.setEnabled(true);
                LastCardB2();
            }
            if (x3C == 0 && y3C == 0) {
                blue3butt.setEnabled(false);
            } else {
                blue3butt.setEnabled(true);
                LastCardB3();
            }
            if (x4C == 0 && y4C == 0) {
                blue4butt.setEnabled(false);
            } else {
                blue4butt.setEnabled(true);
                LastCardB4();
            }

        }

    }

    void RedUserTurnB() {
        blue1butt.setEnabled(false);
        blue2butt.setEnabled(false);
        blue3butt.setEnabled(false);
        blue4butt.setEnabled(false);
        if (randomNum == 6) {
            red1butt.setEnabled(true);
            LastCardR1B();
            red2butt.setEnabled(true);
            LastCardR2B();
            red3butt.setEnabled(true);
            LastCardR3B();
            red4butt.setEnabled(true);
            LastCardR4B();

        }
        if (randomNum != 6) {
            if (x1 == 0 && y1 == 0) {
                red1butt.setEnabled(false);
            } else {
                red1butt.setEnabled(true);
                LastCardR1B();
            }
            if (x2 == 0 && y1 == 0) {
                red2butt.setEnabled(false);
            } else {
                red2butt.setEnabled(true);
                LastCardR2B();
            }
            if (x3 == 0 && y3 == 0) {
                red3butt.setEnabled(false);
            } else {
                red3butt.setEnabled(true);
                LastCardR3B();
            }
            if (x4 == 0 && y4 == 0) {
                red4butt.setEnabled(false);
            } else {
                red4butt.setEnabled(true);
                LastCardR4B();
            }

        }

        /* if (randomNum == 6) {
            jButton1.setEnabled(true);
            jButton5.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            LastCardR1B();
            LastCardR2B();
            LastCardR3B();
            LastCardR4B();
        }*/
    }

    void LastCardR1B() {

        if (x1 == 285 && y1 == 535 && randomNum > 5) {
            red1butt.setEnabled(false);
        } else if (x1 == 285 && y1 == 485 && randomNum > 4) {
            red1butt.setEnabled(false);
        } else if (x1 == 285 && y1 == 435 && randomNum > 3) {
            red1butt.setEnabled(false);
        } else if (x1 == 285 && y1 == 385 && randomNum > 2) {
            red1butt.setEnabled(false);
        } else if (x1 == 285 && y1 == 335 && randomNum > 1) {
            red1butt.setEnabled(false);
        } else if (x1 == 285 && y1 == 285) {
            red1butt.setEnabled(false);
        } else if (x1 == 0 && y1 == 0) {
            red1butt.setEnabled(false);
            if (randomNum == 6) {
                red1butt.setEnabled(true);
            }
        }
    }

    void LastCardR2B() {

        if (x2 == 285 && y2 == 535 && randomNum > 5) {
            red2butt.setEnabled(false);
        } else if (x2 == 285 && y2 == 485 && randomNum > 4) {
            red2butt.setEnabled(false);
        } else if (x2 == 285 && y2 == 435 && randomNum > 3) {
            red2butt.setEnabled(false);
        } else if (x2 == 285 && y2 == 335 && randomNum > 1) {
            red2butt.setEnabled(false);
        } else if (x2 == 285 && y2 == 285) {
            red2butt.setEnabled(false);
        } else if (x2 == 0 && y2 == 0) {
            red2butt.setEnabled(false);
            if (randomNum == 6) {
                red2butt.setEnabled(true);
            }
        }
    }

    void LastCardR3B() {

        if (x3 == 285 && y3 == 535 && randomNum > 5) {
            red3butt.setEnabled(false);
        } else if (x3 == 285 && y3 == 485 && randomNum > 4) {
            red3butt.setEnabled(false);
        } else if (x3 == 285 && y3 == 435 && randomNum > 3) {
            red3butt.setEnabled(false);
        } else if (x3 == 285 && y3 == 385 && randomNum > 2) {
            red3butt.setEnabled(false);
        } else if (x3 == 285 && y3 == 335 && randomNum > 1) {
            red3butt.setEnabled(false);
        } else if (x3 == 285 && y3 == 285) {
            red3butt.setEnabled(false);
        } else if (x3 == 0 && y3 == 0) {
            red3butt.setEnabled(false);
            if (randomNum == 6) {
                red3butt.setEnabled(true);
            }
        }

    }

    void LastCardR4B() {

        if (x4 == 285 && y4 == 535 && randomNum > 5) {
            red4butt.setEnabled(false);
        } else if (x4 == 285 && y4 == 485 && randomNum > 4) {
            red4butt.setEnabled(false);
        } else if (x4 == 285 && y4 == 435 && randomNum > 3) {
            red4butt.setEnabled(false);
        } else if (x4 == 285 && y4 == 385 && randomNum > 2) {
            red4butt.setEnabled(false);
        } else if (x4 == 285 && y4 == 335 && randomNum > 1) {
            red4butt.setEnabled(false);
        } else if (x4 == 285 && y4 == 285) {
            red4butt.setEnabled(false);
        } else if (x4 == 0 && y4 == 0) {
            red4butt.setEnabled(false);
            if (randomNum == 6) {
                red4butt.setEnabled(true);
            }
        }

    }

    void tester() {
        if (!blue1butt.isEnabled() && !blue2butt.isEnabled() && !blue3butt.isEnabled() && !blue4butt.isEnabled()) {
            jLabel3.setText("Red User Turn");
        } else if (!red1butt.isEnabled() && !red2butt.isEnabled() && !red3butt.isEnabled() && !red4butt.isEnabled()) {
            jLabel3.setText("Blue User Turn");
        } else if (!blue1butt.isEnabled() && !blue2butt.isEnabled()
                && !blue3butt.isEnabled() && !blue4butt.isEnabled()
                && !red1butt.isEnabled() && !red2butt.isEnabled()
                && !red3butt.isEnabled() && !red4butt.isEnabled()) {
            jLabel3.setText("Wait For the roller dice");

        }
    }

    void winner() {
        if ((x1C == 285 && y1C == 285) && (x2C == 285 && y2C == 285) && (x3C == 285 && y3C == 285) && (x4C == 285 && y4C == 285)) {
            JOptionPane.showMessageDialog(null, "Blue User Wins");
            //  reset();
        } else if ((x1 == 285 && y1 == 285) && (x2 == 285 && y2 == 285) && (x3 == 285 && y3 == 285) && (x4 == 285 && y4 == 285)) {
            JOptionPane.showMessageDialog(null, "Red User Wins");
            // reset();
        }
    }

    void auto() {
        if (blue1butt.isEnabled() && !blue2butt.isEnabled()
                && !blue3butt.isEnabled() && !blue4butt.isEnabled()) {
            // 8
            blue1butt(randomNum);
            blue1kill();

            if (randomNum != 6) {
                blue1butt.setEnabled(false);
                blue2butt.setEnabled(false);
                blue3butt.setEnabled(false);
                blue4butt.setEnabled(false);
            }

            winner();
        } else if (!blue1butt.isEnabled() && blue2butt.isEnabled()
                && !blue3butt.isEnabled() && !blue4butt.isEnabled()) {
            //7
            blue2butt(randomNum);
            blue2kill();

            if (randomNum != 6) {
                blue1butt.setEnabled(false);
                blue2butt.setEnabled(false);
                blue3butt.setEnabled(false);
                blue4butt.setEnabled(false);
            }

            winner();

        } else if (!blue1butt.isEnabled() && !blue2butt.isEnabled()
                && blue3butt.isEnabled() && !blue4butt.isEnabled()) {
            //9
            blue3butt(randomNum);
            blue3kill();

            if (randomNum != 6) {
                blue1butt.setEnabled(false);
                blue2butt.setEnabled(false);
                blue3butt.setEnabled(false);
                blue4butt.setEnabled(false);
            }

            winner();

        } else if (!blue1butt.isEnabled() && !blue2butt.isEnabled()
                && !blue3butt.isEnabled() && blue4butt.isEnabled()) {
            //6
            blue4butt(randomNum);
            blue4kill();

            if (randomNum != 6) {
                blue1butt.setEnabled(false);
                blue2butt.setEnabled(false);
                blue3butt.setEnabled(false);
                blue4butt.setEnabled(false);
            }

            winner();

        } else if (red1butt.isEnabled() && !red2butt.isEnabled()
                && !red3butt.isEnabled() && !red4butt.isEnabled()) {
            //1
            red1butt(randomNum);
            red1kill();

            if (randomNum != 6) {
                red1butt.setEnabled(false);
                red2butt.setEnabled(false);
                red3butt.setEnabled(false);
                red4butt.setEnabled(false);
            }
            winner();
        } else if (!red1butt.isEnabled() && red2butt.isEnabled()
                && !red3butt.isEnabled() && !red4butt.isEnabled()) {
            //5
            red2butt(randomNum);
            red2kill();

            if (randomNum != 6) {
                red1butt.setEnabled(false);
                red2butt.setEnabled(false);
                red3butt.setEnabled(false);
                red4butt.setEnabled(false);
            }
            winner();
        } else if (!red1butt.isEnabled() && !red2butt.isEnabled()
                && red3butt.isEnabled() && !red4butt.isEnabled()) {
            //3
            red3butt(randomNum);
            red3kill();

            if (randomNum != 6) {
                red1butt.setEnabled(false);
                red2butt.setEnabled(false);
                red3butt.setEnabled(false);
                red4butt.setEnabled(false);

            }
            winner();
        } else if (!red1butt.isEnabled() && !red2butt.isEnabled()
                && !red3butt.isEnabled() && red4butt.isEnabled()) {
            //4
            red4butt(randomNum);
            red4kill();

            if (randomNum != 6) {
                red1butt.setEnabled(false);
                red2butt.setEnabled(false);
                red3butt.setEnabled(false);
                red4butt.setEnabled(false);
            }
            winner();
        }
    }

    void TakeNapBlueB() {
        blue1butt.setVisible(false);
        blue2butt.setVisible(false);
        blue3butt.setVisible(false);
        blue4butt.setVisible(false);
        
       // blue1butt.setLocation(0,0);
      //  blue2butt.setLocation(0,0);
      //  blue3butt.setLocation(0,0);
       // blue4butt.setLocation(0,0);
    }

    void TakeNapRedB() {
        red1butt.setVisible(false);
        red2butt.setVisible(false);
        red3butt.setVisible(false);
        red4butt.setVisible(false);
        //red1butt.setLocation(0,0);
       // red2butt.setLocation(0,0);
        //red3butt.setLocation(0,0);
        //red4butt.setLocation(0,0);
    }

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blue1butt = new javax.swing.JButton();
        blue2butt = new javax.swing.JButton();
        blue4butt = new javax.swing.JButton();
        blue3butt = new javax.swing.JButton();
        red2butt = new javax.swing.JButton();
        red3butt = new javax.swing.JButton();
        blue2 = new javax.swing.JLabel();
        blue3 = new javax.swing.JLabel();
        blue4 = new javax.swing.JLabel();
        blue1 = new javax.swing.JLabel();
        red2 = new javax.swing.JLabel();
        red3 = new javax.swing.JLabel();
        red4 = new javax.swing.JLabel();
        red1 = new javax.swing.JLabel();
        red4butt = new javax.swing.JButton();
        red1butt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        blue1butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        blue1butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue1buttActionPerformed(evt);
            }
        });
        getContentPane().add(blue1butt);
        blue1butt.setBounds(430, 30, 40, 40);

        blue2butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        blue2butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue2buttActionPerformed(evt);
            }
        });
        getContentPane().add(blue2butt);
        blue2butt.setBounds(430, 30, 40, 40);

        blue4butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        blue4butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue4buttActionPerformed(evt);
            }
        });
        getContentPane().add(blue4butt);
        blue4butt.setBounds(430, 30, 40, 40);

        blue3butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        blue3butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue3buttActionPerformed(evt);
            }
        });
        getContentPane().add(blue3butt);
        blue3butt.setBounds(430, 30, 40, 40);

        red2butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        red2butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red2buttActionPerformed(evt);
            }
        });
        getContentPane().add(red2butt);
        red2butt.setBounds(30, 420, 40, 40);

        red3butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        red3butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red3buttActionPerformed(evt);
            }
        });
        getContentPane().add(red3butt);
        red3butt.setBounds(30, 420, 40, 40);

        blue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        getContentPane().add(blue2);
        blue2.setBounds(490, 30, 40, 40);

        blue3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        getContentPane().add(blue3);
        blue3.setBounds(540, 80, 40, 40);

        blue4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        getContentPane().add(blue4);
        blue4.setBounds(490, 80, 40, 40);

        blue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngaaa.com-1402824 (2).png"))); // NOI18N
        getContentPane().add(blue1);
        blue1.setBounds(530, 30, 40, 40);

        red2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        getContentPane().add(red2);
        red2.setBounds(30, 480, 40, 40);

        red3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        getContentPane().add(red3);
        red3.setBounds(90, 530, 40, 40);

        red4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        getContentPane().add(red4);
        red4.setBounds(80, 480, 40, 40);

        red1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        getContentPane().add(red1);
        red1.setBounds(30, 530, 40, 40);

        red4butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        red4butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red4buttActionPerformed(evt);
            }
        });
        getContentPane().add(red4butt);
        red4butt.setBounds(30, 420, 40, 40);

        red1butt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/321.png"))); // NOI18N
        red1butt.setActionCommand("jLabel1");
        red1butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red1buttActionPerformed(evt);
            }
        });
        getContentPane().add(red1butt);
        red1butt.setBounds(30, 420, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/123.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 90, 510, 510);

        jButton11.setText("Play");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(270, 640, 57, 24);

        jLabel2.setText("0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 610, 41, 16);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 630, 140, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Random rn = new Random();
        int range = 6 - 1 + 1;
        int Ran = rn.nextInt(range) + 1;
        randomNum = Ran;
        jLabel2.setText(Integer.toString(Ran));
        System.out.println(x1C + " " + y1C);
        //    System.out.println(jButton7.getLocation());
        //     System.out.println(jButton9.getLocation());
        //   System.out.println(jButton6.getLocation());

        if (co % 2 == 0 && randomNum != 6) { // even ya3ny red

            RedUserTurnB();
            // label2.setText("Blue User Turn");
            co++;
        } else if (co % 2 == 0 && randomNum == 6) {
            RedUserTurnB();
            co = co;

        } else if (co % 2 != 0 && randomNum != 6) { // odd ya3ny blu
            BlueUserTurn();
            // label2.setText("Red User Turn");
            co++;

        } else if ((co % 2 != 0 && randomNum == 6)) {

            BlueUserTurn();
            co = co;
        }

        tester();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void red1buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red1buttActionPerformed
        red1(randomNum);
        red1kill();

        TakeNapRedB();

        winner();
        // TODO add your handling code here:
    }//GEN-LAST:event_red1buttActionPerformed

    private void red2buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red2buttActionPerformed
        red2(randomNum);
        red2kill();

        TakeNapRedB();

        winner();        // TODO add your handling code here:
    }//GEN-LAST:event_red2buttActionPerformed

    private void red3buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red3buttActionPerformed
        red4(randomNum);
        red4kill();

        TakeNapRedB();

        winner();        // TODO add your handling code here:
    }//GEN-LAST:event_red3buttActionPerformed

    private void red4buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red4buttActionPerformed
        red1(randomNum);
        red1kill();

        TakeNapRedB();

        winner();        // TODO add your handling code here:
    }//GEN-LAST:event_red4buttActionPerformed

    private void blue1buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue1buttActionPerformed
        blue1(randomNum);
        blue1kill();

        TakeNapBlueB();

        winner();        // TODO add your handling code here:
    }//GEN-LAST:event_blue1buttActionPerformed

    private void blue2buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue2buttActionPerformed
        blue2(randomNum);
        blue2kill();

        TakeNapBlueB();

        winner();        // TODO add your handling code here:
    }//GEN-LAST:event_blue2buttActionPerformed

    private void blue3buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue3buttActionPerformed
        blue3(randomNum);
        blue3kill();

        TakeNapBlueB();

        winner();        // TODO add your handling code here:
    }//GEN-LAST:event_blue3buttActionPerformed

    private void blue4buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue4buttActionPerformed
        blue4(randomNum);
        blue4kill();

        TakeNapBlueB();

        winner();        // TODO add your handling code here:
    }//GEN-LAST:event_blue4buttActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blue1;
    private javax.swing.JButton blue1butt;
    private javax.swing.JLabel blue2;
    private javax.swing.JButton blue2butt;
    private javax.swing.JLabel blue3;
    private javax.swing.JButton blue3butt;
    private javax.swing.JLabel blue4;
    private javax.swing.JButton blue4butt;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel red1;
    private javax.swing.JButton red1butt;
    private javax.swing.JLabel red2;
    private javax.swing.JButton red2butt;
    private javax.swing.JLabel red3;
    private javax.swing.JButton red3butt;
    private javax.swing.JLabel red4;
    private javax.swing.JButton red4butt;
    // End of variables declaration//GEN-END:variables
}
