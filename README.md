# java-ile-aile-agaci-olusturma
excel dosyasından alınan verilere göre aile ağacı oluşturma

Projeye ait detaylı bilgiye aşağıdaki rapordan ulaşabilirsiniz

[Rapor.pdf](https://github.com/NurSedaNur/java-ile-aile-agaci-olusturma/files/12652469/Rapor.pdf)


1.PROJE HAKKINDA
Bu projenin amacı, verilecek olan
excel dosyalarında bulunan kişi
bilgilerini kullanarak soy ağacı
oluşturmak ve bu soy ağacı
üzerinden çeşitli işlemler
yapmaktır.Proje kapsamında;
birçok aileye mensup kişilere ait,
çeşitli bilgiler içeren 4 excel dosyası
verilecektir. Verilen bu
dosyalardaki ailelerin birbiriyle
çeşitli şekillerde kesişimi olacaktır.
Dosyaların program tarafından
okunup içindeki bilgilerin
kullanılarak kişiye ait soy ağacının
oluşturulması projenin en temel
hedefidir. Kişi için sınıf
oluşturulacaktır. Kişi sınıfı tc-no
(id), ad, soyadı, doğum tarihi, anne
adı, baba adı, kan grubu ve meslek
özellikleri, kızlık soyadı ve cinsiyet
ile oluşturulacaktır. Excel
içerisindeki her satır ağaçta
bulunacak bir düğümü
oluşturacaktır. İlk düğümde
bulunan kişilerin anne ve babaları
için ekstra bir düğüm
oluşturulmayacaktır (ağaç ilk
satırdaki kişilerden başlayacak).Bu proje kapsamında soy ağacı
kullanılarak bazı problemlerin
çözülmesi istenmektedir
2. BAŞLANGIÇ
Öncelikle bize verilen excel
dosyasını sayfa sayfa okutmayı
öğrendik. Apache.poi kütüphanesi
yardımıyla her sayfayı tek tek
okuduk. Sayfadaki her bir hücreyi
tek tek ad, soyad, dogumTarihi,
uyeninEsi, anneAdı , babaAdı,
kanGrubu, meslek, evliBekar,
kızlıkSoyadı ve cinsiyet özelliklerine
atadık. Bu değerleri
oluşturduğumuz ağaca ekledik.
Switch-case döngüsü ile isterleri
kullanıcının isteğine göre
listelemesini sağladık.
Ağac classında arama ve ekleme
fonkiyonlarını oluşturduk. Aile
ağacını bu classta oluşturduk.
AğacNode ve AileUyesi
classlarında üyelerin ve
aralarındaki akrabalık ilişkilerini
tanımladık.


