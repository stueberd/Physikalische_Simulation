package test;

import de.physolator.usr.GraphicsComponents;
import de.physolator.usr.PhysicalSystem;
import de.physolator.usr.PlotterDescriptors;
import de.physolator.usr.V;
import de.physolator.usr.tvg.TVG;

public class TestSystem extends PhysicalSystem {

	@V(unit = "m", derivative = "v")
	public double x = 3;
	
	@V(unit = "m/s", derivative = "a")
	public double v = 5;
	
	@V(unit = "m/s^2")
	public double a;

	@Override
	public void f(double t, double h) {
		a = -9.81 - 0.1 *Math.signum(v) *Math.pow(v,2);
	}

	@Override
	public void initPlotterDescriptors(PlotterDescriptors r) {
		r.add("x,v,a", 5, -15, 15);
	}
	

	@Override
	public void initGraphicsComponents(GraphicsComponents g) {
		g.addTVG(new TVG() {
			@Override
			public void paint() {
			double p = 50;
			double q = 150 + x * 20;
			drawCircle(p, q, 14);
			drawLineArrow(p, q, p, q + 5 * v);
			}
			
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}

}
