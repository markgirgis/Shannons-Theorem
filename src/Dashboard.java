import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Dashboard extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane root = new GridPane();
	    
	    root.add( getPieChart(), 0, 0);
	    root.add( getBubbleChart(), 1, 0);
    	root.add( getScatterChart(), 0, 1);
    	root.add( getLineChart(), 1, 1);
    	Scene scene = new Scene(root, 1024, 768);
    


	    primaryStage.setScene(scene);
        primaryStage.show();
		
	}
	
	public Node getPieChart(){
		ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Grapefruit", 13),
                new PieChart.Data("Oranges", 25),
                new PieChart.Data("Plums", 10),
                new PieChart.Data("Pears", 22),
                new PieChart.Data("Apples", 30));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Imported Fruits");
		return chart;
		
	}
	
	public Node getBubbleChart(){
		final NumberAxis xAxis = new NumberAxis(1, 53, 4);
        final NumberAxis yAxis = new NumberAxis(0, 80, 10);
        final BubbleChart<Number,Number> blc = new
            BubbleChart<>(xAxis,yAxis);
        xAxis.setLabel("Week");
        yAxis.setLabel("Product Budget");
        blc.setTitle("Budget Monitoring");
       
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Product 1");
        series1.getData().add(new XYChart.Data(3, 35));
        series1.getData().add(new XYChart.Data(12, 60));
        series1.getData().add(new XYChart.Data(15, 15));
        series1.getData().add(new XYChart.Data(22, 30));
        series1.getData().add(new XYChart.Data(28, 20));
        series1.getData().add(new XYChart.Data(35, 41));
        series1.getData().add(new XYChart.Data(42, 17));
        series1.getData().add(new XYChart.Data(49, 30));
                
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Product 2");
        series2.getData().add(new XYChart.Data(8, 15));
        series2.getData().add(new XYChart.Data(13, 23));
        series2.getData().add(new XYChart.Data(15, 45));
        series2.getData().add(new XYChart.Data(24, 30));
        series2.getData().add(new XYChart.Data(38, 78));
        series2.getData().add(new XYChart.Data(40, 41));
        series2.getData().add(new XYChart.Data(45, 57));
        series2.getData().add(new XYChart.Data(47, 23));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Product 3");
        series3.getData().add(new XYChart.Data(10, 15));
        series3.getData().add(new XYChart.Data(15, 23));
        series3.getData().add(new XYChart.Data(17, 45));
        series3.getData().add(new XYChart.Data(26, 30));
        series3.getData().add(new XYChart.Data(30, 78));
        series3.getData().add(new XYChart.Data(44, 41));
        series3.getData().add(new XYChart.Data(48, 57));
        series3.getData().add(new XYChart.Data(49, 23));
        Scene scene  = new Scene(blc);
        blc.getData().addAll(series1, series2, series3);  
		return blc;
		
	}
	
	public Node getScatterChart(){
		 final NumberAxis xAxis = new NumberAxis(0, 10, 1);
	        final NumberAxis yAxis = new NumberAxis(-100, 500, 100);        
	        final ScatterChart<Number,Number> sc = new
	            ScatterChart<>(xAxis,yAxis);
	        xAxis.setLabel("Age (years)");                
	        yAxis.setLabel("Returns to date");
	        sc.setTitle("Investment Overview");
	       
	        XYChart.Series series1 = new XYChart.Series();
	        series1.setName("Equities");
	        series1.getData().add(new XYChart.Data(4.2, 193.2));
	        series1.getData().add(new XYChart.Data(2.8, 33.6));
	        series1.getData().add(new XYChart.Data(6.2, 24.8));
	        series1.getData().add(new XYChart.Data(1, 14));
	        series1.getData().add(new XYChart.Data(1.2, 26.4));
	        series1.getData().add(new XYChart.Data(4.4, 114.4));
	        series1.getData().add(new XYChart.Data(8.5, 323));
	        series1.getData().add(new XYChart.Data(6.9, 289.8));
	        series1.getData().add(new XYChart.Data(9.9, 287.1));
	        series1.getData().add(new XYChart.Data(0.9, -9));
	        series1.getData().add(new XYChart.Data(3.2, 150.8));
	        series1.getData().add(new XYChart.Data(4.8, 20.8));
	        series1.getData().add(new XYChart.Data(7.3, -42.3));
	        series1.getData().add(new XYChart.Data(1.8, 81.4));
	        series1.getData().add(new XYChart.Data(7.3, 110.3));
	        series1.getData().add(new XYChart.Data(2.7, 41.2));
	        
	        XYChart.Series series2 = new XYChart.Series();
	        series2.setName("Mutual funds");
	        series2.getData().add(new XYChart.Data(5.2, 229.2));
	        series2.getData().add(new XYChart.Data(2.4, 37.6));
	        series2.getData().add(new XYChart.Data(3.2, 49.8));
	        series2.getData().add(new XYChart.Data(1.8, 134));
	        series2.getData().add(new XYChart.Data(3.2, 236.2));
	        series2.getData().add(new XYChart.Data(7.4, 114.1));
	        series2.getData().add(new XYChart.Data(3.5, 323));
	        series2.getData().add(new XYChart.Data(9.3, 29.9));
	        series2.getData().add(new XYChart.Data(8.1, 287.4));
	        
	        XYChart.Series series3 = new XYChart.Series();
	        series3.setName("Mutual funds 2");
	        series3.getData().add(new XYChart.Data(6.9, 229.2));
	        series3.getData().add(new XYChart.Data(6.9, 37.6));
	        series3.getData().add(new XYChart.Data(6.9, 49.8));
	        series3.getData().add(new XYChart.Data(6.9, 134));
	        series3.getData().add(new XYChart.Data(6.9, 236.2));
	        series3.getData().add(new XYChart.Data(6.9, 114.1));
	        series3.getData().add(new XYChart.Data(6.9, 323));
	        series3.getData().add(new XYChart.Data(6.9, 29.9));
	        series3.getData().add(new XYChart.Data(6.9, 287.4));
	        sc.getData().addAll(series1, series2, series3);
	        Scene scene  = new Scene(sc, 500, 400);
			return sc;
		
	}
	
	public Node getLineChart(){
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Stock Monitoring, 2010");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));
        
        XYChart.Series series2 = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        series2.getData().add(new XYChart.Data(11, 23));
        series2.getData().add(new XYChart.Data(12, 14));
        series2.getData().add(new XYChart.Data(13, 15));
        series2.getData().add(new XYChart.Data(14, 24));
        series2.getData().add(new XYChart.Data(15, 34));
        series2.getData().add(new XYChart.Data(16, 36));
        series2.getData().add(new XYChart.Data(17, 22));
        series2.getData().add(new XYChart.Data(18, 45));
        series2.getData().add(new XYChart.Data(19, 43));
        series2.getData().add(new XYChart.Data(20, 17));
        series2.getData().add(new XYChart.Data(21, 29));
        series2.getData().add(new XYChart.Data(22, 25));
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().addAll(series, series2);
		return lineChart;
		
	}

}
