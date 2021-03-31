package com.example.linearv02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vr1 = "" //first Number
        var vr3 = 0 // Old Number
        var secondn = 0 //New Number
        var final: Int = 0
        var sym = 0
        var btnc = 0
        var final2 = 0

        onebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(1)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(1)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(1)
                result.setText(vr1)
            }
        }

        twobtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(2)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(2)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(2)
                result.setText(vr1)
            }
        }

        threebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(3)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(3)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(3)
                result.setText(vr1)
            }
        }

        fourbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(4)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(4)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(4)
                result.setText(vr1)
            }
        }


        fivebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(5)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(5)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(5)
                result.setText(vr1)
            }
        }

        sixbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(6)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(6)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(6)
                result.setText(vr1)
            }
        }

        sevenbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(7)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(7)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(7)
                result.setText(vr1)
            }
        }

        eightbtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")

                vr1 = result.text.toString().plus(8)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(8)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(8)
                result.setText(vr1)
            }
        }

        ninebtn.setOnClickListener {
            if (result.text.toString() == "0") {
                result.setText("")
                vr1 = result.text.toString().plus(9)
                result.setText(vr1)
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(9)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(9)
                result.setText(vr1)
            }
        }

        zerobtn.setOnClickListener {
            if (result.text.toString() == "0") {
                vr1 = result.text.toString()
            } else if (btnc > 0) {
                result.setText("")
                vr1 = result.text.toString().plus(0)
                result.setText(vr1)
                btnc = 0
            } else {
                vr1 = result.text.toString().plus(0)
                result.setText(vr1)
            }
        }

        clearbtn.setOnClickListener {
            vr1 = "0"
            final = 0
            final2 = 0
            vr3 = 0
            result.setText(vr1)
        }
        delbtn.setOnClickListener {
            if (vr1.length < 2) { // lenght ตำเเหน่งของตัวนั้นๆ
                vr1 = "0"
                result.setText(vr1)
            } else if (vr1.isNotEmpty()) {
                vr1 = vr1.dropLast(1)
                result.text = vr1
            }
        }


        plusbtn.setOnClickListener {


            if (final > 0) {
                vr3 = final
                final = vr3 + vr1.toInt()
                result.setText(final.toString())
                sym = 1
                btnc = 1
            } else if (vr1 == "") {
                result.setText("Error")
                vr1 = ""
                sym = 1
                btnc = 1
            } else if (vr3 > 0) {
                final = vr3 + vr1.toInt()
                result.setText(final.toString())
                sym = 0
                btnc = 1
            } else {
                vr3 = vr1.toInt()
                vr1 = ""
                sym = 1
                btnc = 1
            }
        }


                minusbtn.setOnClickListener {
                    if (final > 0) {
                        vr3 = final
                        final = vr3 - vr1.toInt()
                        sym = 2
                        btnc = 1
                    } else if (vr1 == "") {
                        result.setText("Error")
                        vr1 = ""
                        sym = 2
                        btnc = 1
                    } else if (vr3 > 0) {
                        final = vr3 - vr1.toInt()
                        result.setText(final.toString())
                        sym = 0
                        btnc = 1
                    }else {
                        vr3 = vr1.toInt()
                        vr1 = ""
                        sym = 2
                        btnc = 1
                    }
                }


        multiplybtn.setOnClickListener {

            if (final > 0) {
                vr3 = final
                final = vr3 * vr1.toInt()
                sym = 3
                btnc = 1
            } else if (vr1 == "") {
                result.setText("Error")
                vr1 = ""
                sym = 3
                btnc = 1
            }
            else if (vr3 > 0) {
                final = vr3 * vr1.toInt()
                result.setText(final.toString())
                sym = 0
                btnc = 1
            } else {
                vr3 = vr1.toInt()
                vr1 = ""
                sym = 3
                btnc = 1
            }
        }



            dividebtn.setOnClickListener {
                if (final > 0) {
                    vr3 = final
                    final = vr3 / vr1.toInt()
                    sym = 4
                    btnc = 1
                }else if (vr1 == "") {
                    result.setText("Error")
                    vr1 = ""
                    sym = 4
                    btnc = 1
                }
                else if (vr3 > 0) {
                    final = vr3 / vr1.toInt()
                    result.setText(final.toString())
                    sym = 0
                    btnc = 1
                }else {
                        vr3 = vr1.toInt()
                        vr1 = ""
                        sym = 4
                        btnc = 1

                }
            }

        modbtn.setOnClickListener {
            if (final > 0) {
                vr3 = vr1.toInt()
                sym = 5
                btnc = 1
            }else if (vr1 == "") {
                result.setText("Error")
                vr1 = ""
                sym = 5
                btnc = 1
            }else {
                vr3 = vr1.toInt()
                vr1 = ""
                sym = 5
                btnc = 1

            }
        }
            eqbtn.setOnClickListener {
                if (sym == 1) {
                    final = vr3 + vr1.toInt()
                    result.setText(final.toString())
                    vr1 = ""
                    sym = 0
                    btnc = 1
                } else if (sym == 2) {
                    final = vr3 - vr1.toInt()
                    result.setText(final.toString())
                    vr1 = ""
                    sym = 0
                    btnc = 0
                } else if (sym == 3) {
                    final = vr3 * vr1.toInt()
                    result.setText(final.toString())
                    vr1 = ""
                    sym = 0
                    btnc = 0
                } else if (sym == 4) {
                    var vr3d = 0.00
                    var finald = 0.00
                    vr3d = vr3.toDouble()
                    if (vr1.toInt() == 0){
                        result.setText("Error")
                    }else {
                       finald =  vr3d / vr1.toDouble()
                        result.setText(finald.toString())
                        final = finald.toInt()
                        vr1 = ""
                        sym = 0
                        btnc = 0
                    }
                }
                else if(sym == 5){
                    var vr3d = 0.00
                    var finald = 0.00
                    vr3d = vr3.toDouble()
                    if (vr1.toInt() == 0){
                        result.setText("Error")
                    }else {
                        finald =  vr3d % vr1.toDouble()
                        result.setText(finald.toString())
                        final = finald.toInt()
                        vr1 = ""
                        sym = 0
                        btnc = 0
                    }
                }
            }
    }
}