package ca.georgiancollege.assignment2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ca.georgiancollege.assignment2.databinding.ActivityMainBinding



/*
*  Abdallah Bilal
*  200494848
*  24/05/2024
*  Calculator UI
*
* */


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*     binding.resultTextView.text = getString(R.string.results)

//        NUMBER BINDINGS

        binding.zeroButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.oneButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.twoButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.threeButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.fourButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.fiveButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.sixButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.sevenButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.eightButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }
        binding.nineButton.setOnClickListener{
            numbersButtonsHandlers(it as Button)
        }

//        OPERATOR BINDINGS

        binding.plusMinusButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.decimalButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.equalsButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.plusButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.minusButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.multiplyButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.divideButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.deleteButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.percentButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
        binding.clearButton.setOnClickListener{
            operatorsButtonsHandlers(it as Button)
        }
    }


    private fun numbersButtonsHandlers(button: Button){
        when(button){

            binding.zeroButton -> {
                binding.resultTextView.text = getString(R.string.zeroButton)
            }

            binding.oneButton -> {
                binding.resultTextView.text = getString(R.string.oneButton)
            }

            binding.twoButton -> {
                binding.resultTextView.text = getString(R.string.twoButton)
            }

            binding.twoButton -> {
                binding.resultTextView.text = getString(R.string.twoButton)
            }

            binding.threeButton -> {
                binding.resultTextView.text = getString(R.string.threeButton)
            }

            binding.fourButton -> {
                binding.resultTextView.text = getString(R.string.fourButton)
            }

            binding.fiveButton -> {
                binding.resultTextView.text = getString(R.string.fiveButton)
            }

            binding.sixButton -> {
                binding.resultTextView.text = getString(R.string.sixButton)
            }

            binding.sevenButton -> {
                binding.resultTextView.text = getString(R.string.sevenButton)
            }

            binding.eightButton -> {
                binding.resultTextView.text = getString(R.string.eightButton)
            }

            binding.nineButton -> {
                binding.resultTextView.text = getString(R.string.nineButton)
            }




        }
    }

    private fun operatorsButtonsHandlers(button: Button){
        when(button){

            binding.plusMinusButton -> {
                binding.resultTextView.text = getString(R.string.plus_minus)
            }

            binding.decimalButton -> {
                binding.resultTextView.text = getString(R.string.decimalButton)
            }

            binding.equalsButton -> {
                binding.resultTextView.text = getString(R.string.equals)
            }

            binding.plusButton -> {
                binding.resultTextView.text = getString(R.string.plus)
            }

            binding.minusButton -> {
                binding.resultTextView.text = getString(R.string.minus)
            }

            binding.multiplyButton -> {
                binding.resultTextView.text = getString(R.string.multiply)
            }

            binding.divideButton -> {
                binding.resultTextView.text = getString(R.string.divide)
            }

            binding.deleteButton -> {
                binding.resultTextView.text = getString(R.string.zeroButton)
            }

            binding.percentButton -> {
                binding.resultTextView.text = getString(R.string.percent)
            }

            binding.clearButton -> {
                binding.resultTextView.text = getString(R.string.zeroButton)
            }



        }
    */
    }
}









