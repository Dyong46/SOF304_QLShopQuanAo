package com.test.NhanVienDAO;

import org.junit.Test;

import com.raven.DAO.NhanVienDAO;
import com.raven.model.NhanVien;

public class testNhanVienDAO {
	NhanVienDAO nvdao;

	// insert function
	@Test(expected = Exception.class)
	public void testInsertWithNullModel() {
		NhanVien model = null;
		nvdao.insert(model);
	}

	@Test(expected = Exception.class)
	public void testInsertWithEmptyModel() {
		NhanVien model = new NhanVien();
		nvdao.insert(model);
	}

	@Test
	public void testInsertWithValidModel() {
		NhanVien model = new NhanVien();
		model.setMaNV("NV010");
		model.setHoten("Thanh");
		model.setGioiTinh(true);
		model.setNgaySinh("2003-10-26");
		model.setEmail("thanh@gmail.com");
		model.setMatKhau("0000");
		model.setSdt("0123449993");
		model.setVaiTro(true);
		nvdao.insert(model);
	}

	// update function
	public void testUpdateWithNullModel() {
		NhanVien model = null;
		nvdao.update(model);
	}

	@Test(expected = Exception.class)
	public void testUodateWithEmptyModel() {
		NhanVien model = new NhanVien();
		nvdao.update(model);
	}

	@Test
	public void testUpdateWithValidModel() {
		NhanVien model = new NhanVien();
		model.setMaNV("NV001");
		model.setHoten("Thanh");
		model.setGioiTinh(true);
		model.setNgaySinh("2003-10-26");
		model.setEmail("thanh@gmail.com");
		model.setMatKhau("0000");
		model.setSdt("0123449993");
		model.setVaiTro(true);
		nvdao.update(model);
	}

	// delete function
	@Test(expected = Exception.class)
	private void testDeleteWithNullID() {
		nvdao.delete(null);
	}
	@Test(expected = Exception.class)
	private void testDeleteWithEmptyID() {
		nvdao.delete("");
	}
	@Test(expected = Exception.class)
	private void testDeleteWithValidID() {
		nvdao.delete("NV002");
	}
}