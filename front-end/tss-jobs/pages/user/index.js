import React, { useState } from 'react'
import Image from 'next/image'
import imageMe from '../../public/45977226.jpeg'
import NavForm from '../../components/nav-form'

const User = () => {

  const [usuario, setUsuario] = useState({
    nome: "",
    email: "user@eail.com",
    senha: "123456",
    valorHora: 0,
    faturarPorMes: 0,
    diasTrabalharSemana: 0,
    horasTrabalharDia: 0,
    semanasFeriasAno: 0,
    urlFoto: "url da foto..."
  })

  const salvar = async () => {
    try {
      const response = await fetch('http://localhost:8080/users', {
        headers: { 'Content-Type': 'application/json' },
        method: 'POST',
        body: JSON.stringify(usuario)
      })
      const data = await response.json()
      alert("Usuário criado com sucesso", data.nome)
    }
    catch (err) {

    }
  }

  const atualizainputs = evt => {
    const value = evt.target.value
    const key = evt.target.name
    setUsuario(old => ({
      ...old,
      [key]: value
    }))
  }

  return (
    <>
      <NavForm title="Perfil" />
      <div className="container mx-auto">
        <div className="grid grid-cols-1 md:grid-rows-1 md:grid-cols-3 md:gap-4 md:mt-2 md:p-2">

          {/* perfil */}
          <div className=" md:row-span-2 bg-white pt-4 flex flex-col items-center justify-items-center">
            <div className="mt-8">
              <Image className="rounded-full" src={imageMe} alt="imagem" width={100}
                height={100} />
            </div>

            <div className="font-bold text-2xl mb-10">
              <span>Nome usuario</span>
            </div>

            <div className="text-center mb-6">
              <span>O valor da sua hora é</span>
              <p className="font-bold">R$ 75,00 reais</p>
            </div>

            <div className="mb-2">
              <button onClick={salvar} className="flex-shrink-0 px-4 py-2 text-base font-semibold text-white bg-purple-600 rounded-lg shadow-md hover:bg-purple-700 focus:outline-none focus:ring-2 focus:ring-purple-500 focus:ring-offset-2 focus:ring-offset-purple-200">
                Salvar Dados
              </button>
            </div>
          </div>

          {/* formulario */}
          <div className=" md:row-span-2 md:col-span-2 mx-2">
            <section className="mb-4">
              <h1 className="font-bold text-2xl mb-4">Dados do perfil</h1>

              <div className="flex flex-row gap-4">
                <input name="nome" onChange={atualizainputs} required type="text" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Nome" />

                <input name="urlFoto" onChange={atualizainputs} type="text" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="URL da foto" />
              </div>
            </section>

            <section>
              <h1 className="font-bold text-2xl mb-4">Planejamento</h1>
              <div className="grid grid-rows-1 grid-cols-1 md:grid-rows-2 md:grid-cols-2 md:gap-4">
                <div>
                  <div className=" md:mb-6">
                    <p className="font-light">
                      Quanto é o valor da minha hora.
                    </p>
                    <input name="valorHora" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="75,00" />
                  </div>

                  <div className=" md:mb-6">
                    <p className="font-light">
                      Quanto eu
                      quero ganhar por mês?
                    </p>
                    <input name="faturarPorMes" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="5.000,00" />
                  </div>

                  <div>
                    <p className="font-light">
                      Quantas horas
                      quero trabalhar por dia?
                    </p>
                    <input name="horasTrabalharDia" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="8" />
                  </div>
                </div>

                <div>
                  <div className=" md:mb-6">
                    <p className="font-light">
                      Quantos dias quero
                      trabalhar por semana?
                    </p>
                    <input name="diasTrabalharSemana" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="6" />
                  </div>

                  <div>
                    <p className="font-light">
                      Quantas semanas
                      por ano você quer tirar férias?
                    </p>
                    <input name="semanasFeriasAno" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="2" />
                  </div>

                  <div className="mt-2">

                  </div>
                </div>
              </div>
            </section>
          </div>
        </div>
      </div>
    </>
  );
}

export default User;
