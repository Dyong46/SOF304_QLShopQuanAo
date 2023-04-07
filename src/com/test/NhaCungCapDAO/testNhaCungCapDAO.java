package com.test.NhaCungCapDAO;

import java.util.List;

import org.junit.Test;

import com.raven.DAO.NhaCungCapDAO;
import com.raven.model.NhaCungCap;

public class testNhaCungCapDAO {

	NhaCungCapDAO nhacungcapDAO;

	// insert function
	@Test(expected = Exception.class)
	public void testInsertWithNullModel() {
		NhaCungCap model = null;
		nhacungcapDAO.insert(model);
	}

	@Test(expected = Exception.class)
	public void testInsertWithEmptyModel() {
		NhaCungCap model = new NhaCungCap();
		nhacungcapDAO.insert(model);
	}

	@Test
	public void testInsertWithValidModel() {
		NhaCungCap model = new NhaCungCap();
		model.setMaNCC("NCC010");
		model.setTenNCC("Dior");
		model.setSdt("09069343434");
		model.setEmail("dior@gmail.com");
		model.setDiachi("09 Cô Bắc, P.1, Q.Phú Nhuận Thành phố Hồ Chí Minh");
		nhacungcapDAO.insert(model);
	}

	// update function
	@Test
	public void testUpdateWithNullModel() {
		NhaCungCap model = null;
		nhacungcapDAO.update(model);
	}

	@Test(expected = Exception.class)
	public void testUodateWithEmptyModel() {
		NhaCungCap model = new NhaCungCap();
		nhacungcapDAO.update(model);
	}

	@Test
	public void testUpdateWithValidModel() {
		NhaCungCap model = new NhaCungCap();
		model.setMaNCC("NCC010");
		model.setTenNCC("Dior");
		model.setSdt("09069343434");
		model.setEmail("dior@gmail.com");
		model.setDiachi("09 Cô Bắc, P.1, Q.Phú Nhuận Thành phố Hồ Chí Minh");
		nhacungcapDAO.update(model);
	}

	// delete function
	@Test(expected = Exception.class)
	private void testDeleteWithNullID() {
		nhacungcapDAO.delete(null);
	}

	@Test(expected = Exception.class)
	private void testDeleteWithEmptyID() {
		nhacungcapDAO.delete("");
	}

	@Test(expected = Exception.class)
	private void testDeleteWithValidID() {
		nhacungcapDAO.delete("NCC002");
	}

//	//select function
//	@Test
//	private void testSelect() {
//		NhaCungCap ncc = new NhaCungCap();
//		List<NhaCungCap> list = 
//	}
//
}