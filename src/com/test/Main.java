package com.test;

import java.awt.Frame;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class Main {
	public static void main(String[] args) {
		System.out.println("creating frame");
		
		Frame frame = new Frame("Test frame");
		frame.setSize(500, 500);

		System.out.println("creating canvas");
		
		GLCanvas canvas = new GLCanvas(new GLCapabilities(GLProfile.getDefault()));
		
		System.out.println("adding listener");
		
		canvas.addGLEventListener(new GLEventListener() {
            @Override
            public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
                System.out.println("reshape");
            }
            @Override
            public void init(GLAutoDrawable drawable) {
        		System.out.println("init");
            }
            @Override
            public void dispose(GLAutoDrawable drawable) {
				System.out.println("dispose");
            }
            @Override
            public void display(GLAutoDrawable drawable) {}
        });

		System.out.println("adding canvas to frame");
		
		frame.add(canvas);
		
		System.out.println("setting visibility");
		
		frame.setVisible(true);
		
		System.out.println("done");
	}
}
