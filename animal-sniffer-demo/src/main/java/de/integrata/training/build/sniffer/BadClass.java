package de.integrata.training.build.sniffer;

import java.sql.SQLFeatureNotSupportedException;

import javax.sql.DataSource;

public class BadClass {

	public static void main(String[] args) {
		DataSource ds = null;
		try {
			// getParentLogger kam erst mit 1.7 dazu
			ds.getParentLogger();
		} catch (SQLFeatureNotSupportedException e) {
			// ignore
		}
	}
}
