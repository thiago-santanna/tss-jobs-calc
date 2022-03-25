import Image from "next/image"
import LogoCalc from '../../public/JobsCalc.svg';
import imageMe from '../../public/45977226.jpeg'
import Link from 'next/link';

const NavBarComponent = () => {
  return (
    <nav className="bg-gray-800">
      <div className="container mx-auto flex items-center justify-between h-16">

        <div className="flex items-center justify-center sm:items-stretch sm:justify-start">
          <div className="flex-shrink-0 flex items-center">
            <Image className="" src={LogoCalc} alt="Workflow" width={130} height={130} />
          </div>
        </div>

        <div>
          <Link href="/user" >
            <a className="font-medium px-3 py-2 text-slate-500 rounded-lg hover:bg-slate-100 hover:text-slate-900">Perfil</a>
          </Link>

          <Link href="/job">
            <a className="font-medium px-3 py-2 text-slate-500 rounded-lg hover:bg-slate-100 hover:text-slate-900">Projetos</a>
          </Link>

          <Link href="/sobre">
            <a className="font-medium px-3 py-2 text-slate-500 rounded-lg hover:bg-slate-100 hover:text-slate-900">Sobre</a>
          </Link>
        </div>

        <div>
          <button type="button" className="bg-gray-800 flex text-sm rounded-full focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-offset-gray-800 focus:ring-white" id="user-menu-button" aria-expanded="false" aria-haspopup="true">
            <span className="sr-only">Open user menu</span>
            <Image className="rounded-full" src={imageMe} alt="imagem" width={45}
              height={45} />
          </button>
        </div>

      </div>
    </nav>
  )
}

export default NavBarComponent