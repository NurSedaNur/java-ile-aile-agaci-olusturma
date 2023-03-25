/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seda;

/**
 *
 * @author sedan
 */
class AileUyesi {
    public String ad,soyad,anneAdı,babaAdı,kanGrubu,meslek,tc_no;
    public String kızlıkSoyadı,cinsiyet,doğumTarihi;
  
    
 
    public AileUyesi(/*String tc_no,String ad,String soyad,String anneAdı,String babaAdı,String kanGrubu,String meslek,String kızlıkSoyadı,String cinsiyet,String dogumTarihi*/){
        this.ad=ad;
        this.anneAdı=anneAdı;
        this.babaAdı=babaAdı;
        this.cinsiyet=cinsiyet;
        this.doğumTarihi=doğumTarihi;
        this.kanGrubu=kanGrubu;
        this.kızlıkSoyadı=kızlıkSoyadı;
        this.meslek=meslek;
        this.soyad=soyad;
        this.tc_no=tc_no;
    }
    public String getad() {
        return this.ad;
    }
    public String getsoad() {
        return this.soyad;
    }
    public String anneAdı() {
        return this.anneAdı;
    }
    public String babaAdı() {
        return this.babaAdı;
    }
    public String cinsiyet() {
        return this.cinsiyet;
    }
    public String dogumTarihi() {
        return this.doğumTarihi;
    }
    public String kanGrubu() {
        return this.kanGrubu;
    }
    public String kızlıkSoyadı() {
        return this.kızlıkSoyadı;
    }
    public String meslek() {
        return this.meslek;
    }
    public String tc_no() {
        return this.tc_no;
    }
      
	public void setad(String ad) {
		this.ad = ad;
	}public void setsoyad(String soyad) {
		this.soyad = soyad;
        }public void setanneAdı(String anneAdı) {
		this.anneAdı = anneAdı;
        }public void setbabaAdı(String babaAdı) {
		this.babaAdı = babaAdı;
        }public void setcinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
        }public void setdoğumTarihi(String doğumTarihi) {
		this.doğumTarihi = doğumTarihi;
        }public void setkanGrubu(String kanGrubu) {
		this.kanGrubu = kanGrubu;
        }public void setkızlıkSoyadı(String kızlıkSoyadı) {
		this.kızlıkSoyadı = kızlıkSoyadı;
        }  public void setmeslek(String meslek) {
		this.meslek = meslek;
        }  public void settc_no(String tc_no) {
		this.tc_no = tc_no;
        }
   

}