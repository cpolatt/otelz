Reservation Specification
=========================

* Go to "https://www.otelz.com/"
* Wait "2000" ms
* Login as "polat.cem@hotmail.com" "Fcempolat7541!."


## Reservation Process

Gidilecek Yer/Otel adı
* Click element by xpath "//input[@name='termInputName']"
* Send keys element by xpath "//input[@name='termInputName']" text "Koc"
* Wait "3000" ms
* Click element by xpath "(//div[@class=' sbo-list-item'])[4]"
* Wait "2000" ms

Giriş Tarihi - Çıkış Tarihi
* Click element by xpath "(//input[@type='text'])[2]"
* Click element by xpath "//td[@id='cl2020-11-1']"
* Wait "3000" ms
* Click element by xpath "//td[@id='cl2020-11-8']"
* Wait "3000" ms

Kişi Sayısı - Yetişkin
* Click element by xpath "(//div[@id='searcboxRomContainer']/div/div/div/div/div/select)[1]"
* Wait "2000" ms
* Click element by xpath "//option[@label='4 Yetişkin']"
* Wait "2000" ms

Kişi Sayısı - Çocuk
* Click element by xpath "(//div[@id='searcboxRomContainer']/div/div/div/div/div/select)[2]"
* Wait "2000" ms
* Click element by xpath "//option[@label='1 Çocuk']"
* Wait "2000" ms

Kişi Sayısı - Çocuk Yaş
* Click element by xpath "(//div[@id='searcboxRomContainer']/div/div/div/div/div/select)[3]"
* Wait "2000" ms
* Click element by xpath "//option[@label='7']"
* Wait "2000" ms

Otel Ara
* Click element by xpath "//button[@class='btn btn-info btn-block btn-lg no-rd no-shadow']"
* Wait "5000" ms

Scroll
* Scroll by visible element "//a[text()='Beyaz Ev Butik Otel Restaurant']"
* Wait "3000" ms

Rezervasyon Yap
* Click element by xpath "(//a[@class='btn btn-block btn-list-res'])[3]"
* Wait "3000" ms

Rezervasyon Yap
* Click element by xpath "//a[@class='btn res-action-btn btn-block']"
* Wait "3000" ms

Hemen Rezervasyon Yap
* Click element by xpath "//a[@class='btn btn-lg btn-info']"
* Wait "5000" ms

Kendi adıma rezervasyon yapıyorum
* Click element by xpath "(//span[@class='circle-box'])[1]"
* Wait "3000" ms

Telefon numarası
* Send keys element by xpath "//input[@id='CustomerInfoPhone']" text "554 836 27 46"
* Wait "3000" ms

Scroll
* Scroll by visible element "(//h3[@class='room-title ng-binding'])[2]"
* Wait "3000" ms

Bu odadaki konuklar adı
* Send keys element by xpath "(//input[@type='text'])[7]" text "Cem"
* Wait "2000" ms

Bu odadaki konuklar soyadı
* Send keys element by xpath "(//input[@type='text'])[8]" text "Polat"
* Wait "2000" ms

* Scroll by visible element "//button[@class='btn btn-block btn-info no-border submit-btn']"

Kişisel verileri Aydınlatma Metni Onay
* Click element by xpath "(//span[@class='square-box'])[2]"
* Wait "3000" ms

Kaydet ve Devam Et.
* Click element by xpath "//button[@class='btn btn-block btn-info no-border submit-btn']"
* Wait "5000" ms
