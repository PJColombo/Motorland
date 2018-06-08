/**
 * 
 */
package Integración.queryFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Integración.query.Query;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Paulo Colombo
 * @generated "UML a Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class QueryFactoryImpDinamica extends QueryFactory {

	@Override
	public Query newQuery(String query) {
		FileInputStream fis;
		Properties propQueries = new Properties();
		String className; 
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Query q = null; 
		try {
			fis = new FileInputStream(new File("config/queries"));
			propQueries.load(fis);
			className = propQueries.getProperty(query);
			if(className != null) {
				Class<?> c = loader.loadClass(className);
				Class.forName(className);
				q = (Query) c.newInstance();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return q;
	}
}