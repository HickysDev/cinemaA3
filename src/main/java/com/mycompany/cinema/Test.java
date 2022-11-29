
package com.mycompany.cinema;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test
{
	public static void main( String args[] )
	{
		JFrame frame = new JFrame();

		JPanel panel = new JPanel();
		panel.setLayout( null );

		ImageIcon icon = new ImageIcon( "C:/Users/gabri/Desktop/body.png" );
		int width = icon.getIconWidth();
		int height = icon.getIconHeight();
		JLabel image = new JLabel( icon );
		image.setBounds( 0, 0, width, height );

		JPanel areaClicavel1 = new JPanel();
		areaClicavel1.setName( "área 1" );
		// para teste
		areaClicavel1.setBackground( Color.CYAN );
		areaClicavel1.setBounds( 10, 20, 50, 50 );
		areaClicavel1.addMouseListener( getMouseListener() );

		JPanel areaClicavel2 = new JPanel();
		areaClicavel2.setName( "área 2" );
		areaClicavel2.setBackground( Color.BLACK );
		areaClicavel2.setBounds( 30, 60, 40, 40 );
		areaClicavel2.addMouseListener( getMouseListener() );

		panel.add( areaClicavel1 );
		panel.add( areaClicavel2 );

		panel.add( image );

		frame.setSize( width, height );
		frame.add( panel );
		frame.setLocationRelativeTo( null );

		frame.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		frame.setVisible( true );
	}

	private static MouseListener getMouseListener()
	{
		return new MouseAdapter()
		{
			public void mouseClicked( MouseEvent e )
			{
				System.out.println( ( ( JComponent ) e.getSource() ).getName() );
			}
		};
	}
}